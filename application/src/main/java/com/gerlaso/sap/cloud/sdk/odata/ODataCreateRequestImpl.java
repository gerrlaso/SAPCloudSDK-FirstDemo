package com.gerlaso.sap.cloud.sdk.odata;

import static com.sap.cloud.sdk.odatav2.connectivity.internal.ODataConnectivityUtil.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.entity.StringEntity;
import org.apache.olingo.odata2.api.edm.Edm;
import org.apache.olingo.odata2.api.edm.EdmAssociationSet;
import org.apache.olingo.odata2.api.edm.EdmAssociationSetEnd;
import org.apache.olingo.odata2.api.edm.EdmEntitySet;
import org.apache.olingo.odata2.api.edm.EdmEntityType;
import org.apache.olingo.odata2.api.edm.EdmException;
import org.apache.olingo.odata2.api.edm.EdmNavigationProperty;
import org.apache.olingo.odata2.api.ep.EntityProviderException;
import org.apache.olingo.odata2.api.ep.entry.ODataEntry;
import org.apache.olingo.odata2.api.processor.ODataResponse;
import org.apache.olingo.odata2.client.api.ODataClient;
import org.apache.olingo.odata2.client.api.ep.DeserializerProperties;
import org.apache.olingo.odata2.client.api.ep.Entity;
import org.apache.olingo.odata2.client.api.ep.EntitySerializerProperties;
import org.apache.olingo.odata2.client.api.ep.EntityStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gerlaso.sap.cloud.sdk.odata.ODataCreateRequest;
import com.gerlaso.sap.cloud.sdk.odata.ODataCreateResult;
import com.sap.cloud.sdk.cloudplatform.cache.CacheKey;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpClientAccessor;
import com.sap.cloud.sdk.cloudplatform.connectivity.WithDestinationName;
import com.sap.cloud.sdk.odatav2.connectivity.ErrorResultHandler;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.odatav2.connectivity.ODataExceptionType;
import com.sap.cloud.sdk.odatav2.connectivity.cache.metadata.GuavaMetadataCache;
import com.sap.cloud.sdk.odatav2.connectivity.cache.metadata.MetadataCache;
import com.sap.cloud.sdk.odatav2.connectivity.internal.EdmWithCSRF;
import com.sap.cloud.sdk.odatav2.connectivity.internal.ODataConnectivityUtil;

public class ODataCreateRequestImpl implements ODataCreateRequest {
	
	private static Logger logger = LoggerFactory.getLogger(ODataCreateRequestImpl.class);
	private static final String APPLICATION_JSON = "application/json";
	private static final String UTF_8 = "UTF-8";
	private static MetadataCache metadataCache = new GuavaMetadataCache();
	public static final String AUTHORIZATION_HEADER = "Authorization";
	private Boolean entityCreated = false;
	String location = null;

	/**
	 * Content Type Constants
	 */
	public static final String CONTENT_TYPE = "Content-Type";
	public static final String ACCEPT_HEADER = "Accept";
	public static final String CONTENTTYPE_ATOM_XML = "application/xml";
	private String serviceName;
	private String entitySet;
	private Map<String, Object> body;
	private ErrorResultHandler<?> errorHandler;
	private Map<String, String> headers;
	private Map<String, String> destinationRelevantHeaders;
	private Boolean cacheMetadata;
	private String navigationProperty = null;
	private Map<String,Object> srcKeyMap = null;
	private URL metadataFilePath;
	private CacheKey cacheKey;
	private Boolean isCacheRefresh;
	
  /*
     * Constructor for Create Via Navigation
     * */
	public ODataCreateRequestImpl(String serviceName, String entitySetName, Map<String, Object> body, String navigationProperty,  Map<String,Object> srcKeyMap,
			ErrorResultHandler<?> errorHandler, Map<String, String> headers,
			Map<String, String> destinationRelevantHeaders, Boolean cacheMetadata, URL metadataFilePath,CacheKey cacheKey, Boolean isCacheRefresh) {
		this.serviceName = serviceName;
		this.entitySet = entitySetName;
		this.body = body;
		this.srcKeyMap = srcKeyMap ;
		this.navigationProperty = navigationProperty;
		this.errorHandler = errorHandler;
		this.headers = headers;
		this.destinationRelevantHeaders = destinationRelevantHeaders;
		this.cacheMetadata = cacheMetadata;
		this.metadataFilePath = metadataFilePath;
		this.cacheKey = cacheKey;
		this.isCacheRefresh = isCacheRefresh;
	}
	 /*
     * Constructor for Simple Create
     * */
	public ODataCreateRequestImpl(String serviceName, String entitySetName, Map<String, Object> body,  
			ErrorResultHandler<?> errorHandler, Map<String, String> headers,
			Map<String, String> destinationRelevantHeaders, Boolean cacheMetadata, URL metadataFilePath,CacheKey cacheKey, boolean isCacheRefresh) {
		this.serviceName = serviceName;
		this.entitySet = entitySetName;
		this.body = body;
		this.errorHandler = errorHandler;
		this.headers = headers;
		this.destinationRelevantHeaders = destinationRelevantHeaders;
		this.cacheMetadata = cacheMetadata;
		this.metadataFilePath = metadataFilePath;
		this.cacheKey = cacheKey;
		this.isCacheRefresh = isCacheRefresh;
	}

  String getServiceName() {
    return serviceName;
  }
  String getEntitySet() {
    return entitySet;
  }
  Map<String, Object> getBody() {
    return body;
  }
  Map<String, String> getHeaders() {
    return headers;
  }
  String getNavigationProperty() {
    return navigationProperty;
  }

	@Override
	public ODataCreateResult execute(String destinationName) throws ODataException {
		logger.debug("Create Called with Destination Name: " + destinationName);	
		return handleExecute(null, destinationName);
	}

	public ODataCreateResult getResponseFromLocation(String completeUrl, String destinationName) throws ODataException {
		HttpResponse httpResponse = null;
		try {
			Edm edm = metadataCache.getEdm(completeUrl, getHttpClient(destinationName), destinationRelevantHeaders,
					errorHandler, cacheMetadata,metadataFilePath,cacheKey,isCacheRefresh);
			EdmEntitySet eSet = edm.getDefaultEntityContainer().getEntitySet(this.entitySet);
			HttpGet requestGet = new HttpGet(location);
			httpResponse = getHttpClient(destinationName).execute(requestGet);
			ODataConnectivityUtil.checkHttpStatus(httpResponse, errorHandler);
			EntityStream entityStream = new EntityStream();
			entityStream.setContent(httpResponse.getEntity().getContent());
			entityStream.setReadProperties(DeserializerProperties.init().build());
			String contentType = "application/atom+xml";
			if (!httpResponse.getFirstHeader("Content-Type").toString().contains(contentType))
				contentType = "application/json";
			ODataEntry deepInsResponse = ODataClient.newInstance().createDeserializer(contentType).readEntry(eSet,
					entityStream);
			return new ODataCreateResult(httpResponse, deepInsResponse.getProperties());
		} catch (IOException e1) {
			HttpClientUtils.closeQuietly(httpResponse);
			throw new ODataException(null, "IOException", e1);
		} catch (EntityProviderException | EdmException e1) {
			HttpClientUtils.closeQuietly(httpResponse);
			throw new ODataException(ODataExceptionType.RESPONSE_DESERIALIZATION_FAILED,
					"Error during serialization of input payload. " + e1.getMessage(), e1);
		} finally {
			HttpClientUtils.closeQuietly(httpResponse);
		}
	}
	private boolean isNavigationFlow(){
		return (navigationProperty == null)  ? false: true;
	}

	ODataCreateResult create(HttpClient httpClient) throws ODataException {
		String serviceUri = this.serviceName;
		String entitySetName = this.entitySet;
		String completeUrl = null;
		completeUrl = serviceUri + "/" + entitySetName;
		
		HttpResponse httpResponse = null;
		String contentType = APPLICATION_JSON;
		// To get the EdmEntitySet Object
		// Get the edm object first.
		Edm edm = null;

		ODataResponse response = null;
		Entity entity = null;

		EdmWithCSRF edmWithCSRF = null;
		try {
			edmWithCSRF = ODataConnectivityUtil.readMetadataWithCSRF(serviceUri, httpClient, destinationRelevantHeaders,
					errorHandler, cacheMetadata,metadataFilePath,cacheKey,isCacheRefresh);
		} catch (IOException e1) {
			throw new ODataException(ODataExceptionType.METADATA_FETCH_FAILED, "Metadata fetch failed!", e1);
		}
		if (edmWithCSRF == null || edmWithCSRF.getEdm() == null) {
			throw new ODataException(ODataExceptionType.METADATA_FETCH_FAILED, "Metadata fetch failed!", null);
		}
		edm = edmWithCSRF.getEdm();
		EdmEntitySet eSet;
		EdmEntityType entityType;
		EdmEntityType childEntityType = null;
		EdmEntitySet targetEtySet = null;
		EdmNavigationProperty navigationProperty = null;
		boolean isNavigationFlow = isNavigationFlow();
		
		try {
			eSet = edm.getDefaultEntityContainer().getEntitySet(entitySetName);
			if (eSet == null)
				throw new ODataException(ODataExceptionType.INVALID_ENTITY_NAME,
						"No entity with name " + entitySetName + " in the OData service", null);
			entityType = eSet.getEntityType();
			if(isNavigationFlow)
			    navigationProperty = getNavigationProperty(eSet);
			if(navigationProperty!=null){
				// Find Target Type and Set for Navigation 
				childEntityType = getTargetEntityType(edm, eSet ,navigationProperty);
				//Must have association set
				targetEtySet = getTargetEntitySet(edm, eSet , navigationProperty);
			}
			if(childEntityType!=null) {
				 //for Create via Navigation
				 entity = ODataConnectivityUtil.addPropertiesToEntity(this.body, childEntityType);
			 }
			 else
				 //for Simple Create  
				 entity = ODataConnectivityUtil.addPropertiesToEntity(this.body, entityType);
			completeUrl = handleNavigation(completeUrl,entityType);
		} catch (EdmException e) {
			throw new ODataException(ODataExceptionType.METADATA_PARSING_FAILED, "Error while parsing the metadata.",
					e);
		}
		
		HttpPost requestPost = new HttpPost(completeUrl);
		
		// Set CSRF Token Header.
		requestPost.setHeader(ODataConnectivityUtil.CSRF_HEADER, edmWithCSRF.getCsrfToken());
		// Set Content-Type header
		requestPost.setHeader(CONTENT_TYPE, contentType);
		requestPost.setHeader(ACCEPT_HEADER, contentType);
		for (Entry<String, String> header : headers.entrySet()) {
			requestPost.setHeader(header.getKey(), header.getValue());
		}
		
		entity.setWriteProperties(EntitySerializerProperties.serviceRoot(URI.create(serviceUri)).build());
		try {
			//Target EntitySet via navigation vs directEntityset
			eSet = (targetEtySet!=null) ? targetEtySet: eSet;
			response = ODataClient.newInstance().createSerializer(contentType).writeEntry(eSet, entity);
		} catch (EntityProviderException e) {
			throw new ODataException(ODataExceptionType.INPUT_DATA_SERIALIZATION_FAILED,
					"Error during serialization of input payload. " + e.getMessage(), e);
		}

		try {
			InputStream inputStream = ODataConnectivityUtil.getObjectStream(response.getEntity());
			String entityString = null;
			if (inputStream != null) {
				entityString = getEntityString(inputStream);
				try {
					inputStream.close();
				} catch (IOException e) {
					logger.error("Error while closing the inputstream", e);
				}
			}
			StringEntity postEntity = new StringEntity(entityString, UTF_8);
			requestPost.setEntity(postEntity);
			httpResponse = httpClient.execute(requestPost);
			if (httpResponse.getStatusLine().getStatusCode() == 201) {
				entityCreated = true;
				location = httpResponse.getFirstHeader("Location").getValue();
			}
			ODataConnectivityUtil.checkHttpStatus(httpResponse, errorHandler);
			EntityStream entityStream = new EntityStream();
			entityStream.setContent(httpResponse.getEntity().getContent());
			entityStream.setReadProperties(DeserializerProperties.init().build());
			ODataEntry deepInsResponse = ODataClient.newInstance().createDeserializer(contentType).readEntry(eSet,
					entityStream);
			return new ODataCreateResult(httpResponse, deepInsResponse.getProperties());
		} catch (EntityProviderException e) {
			throw new ODataException(ODataExceptionType.RESPONSE_DESERIALIZATION_FAILED,
					"Error while deserializing response. " + e.getMessage(), e);
		} catch (IllegalStateException | IOException e) {
			throw new ODataException(null, e.getMessage(), e);
		} finally {
			HttpClientUtils.closeQuietly(httpResponse);
		}
	}

	public EdmNavigationProperty getNavigationProperty(EdmEntitySet srcEtySet) throws EdmException{
		if(srcKeyMap == null || navigationProperty== null || srcKeyMap.isEmpty())
			return null;
		EdmEntityType srcEtytype = srcEtySet.getEntityType();
		EdmNavigationProperty navigationProp = (EdmNavigationProperty) srcEtytype.getProperty(navigationProperty) ;
		return navigationProp;
	}
			
	private EdmEntityType getTargetEntityType(Edm edm,  EdmEntitySet srcEtySet ,EdmNavigationProperty navigationProp) throws EdmException {
 
		if(navigationProp == null)
	    	return null ;
		else  {
			//Look for Target Entity Type based on Navigation Property 
			String toRole = navigationProp.getToRole() ;
			return navigationProp.getRelationship().getEnd(toRole).getEntityType();

		}
	 	 
	}
	public EdmEntitySet getTargetEntitySet(Edm edm, EdmEntitySet srcEtySet, EdmNavigationProperty navigationProp) throws EdmException, ODataException{		
		//Look for Target EntitySet Type based on Navigation Property --> Association --> AssociationSet
		EdmAssociationSet associationSet = null;
		associationSet = edm.getDefaultEntityContainer().getAssociationSet(srcEtySet, navigationProp );
		if(associationSet == null){
			throw new ODataException( ODataExceptionType.METADATA_PARSING_FAILED, "The association, referred by the navigation property "+ navigationProp.getName() + ", is not contained in an association set.");
		}
		EdmAssociationSetEnd end = null;
		if(navigationProp!= null){
		  end = associationSet.getEnd(navigationProp.getToRole())  ;
		  return   end.getEntitySet() ;
		  }
		return null;
	}
	public String handleNavigation(String completeUrl, EdmEntityType entityType) throws EdmException, ODataException {
		//Construct  URL 
		if(srcKeyMap == null || navigationProperty== null || srcKeyMap.isEmpty() )
			 return completeUrl;
		else 
			//Construct URL for Key in Parent Entity
			return  completeUrl + '(' + ODataConnectivityUtil.convertKeyValuesToString(srcKeyMap, entityType ) + ')'+'/'+navigationProperty;
	}

	protected HttpClient getHttpClient(String destinationName) {
		return HttpClientAccessor.getHttpClient();
	}

	private String getEntityString(InputStream stream) {

		StringBuilder sb = new StringBuilder();
		String line;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(stream, Charset.forName(UTF_8)))) {

			while ((line = br.readLine()) != null) {

				sb.append(line);
				sb.append("\n");
			}

		} catch (IOException e) {

		}

		return sb.toString();
	}

	@Override
	public ODataCreateResult execute(WithDestinationName withDestinationName) throws ODataException {
		return execute(withDestinationName.getDestinationName());
	}

	@Override
	public ODataCreateResult execute(HttpClient providedClient) throws ODataException {
		logger.debug("Create Called with Direct URL");
		return handleExecute(providedClient, null);
	}

	private ODataCreateResult handleExecute(HttpClient httpClient, String destinationName) throws ODataException {
		ODataCreateResult result = null;
		httpClient = destinationName == null ? httpClient : getHttpClient(destinationName);
		if (cacheMetadata) {
			try {				
				result = create(httpClient);
			} catch (ODataException e) {
				if (e.getODataExceptionType().equals(ODataExceptionType.OTHER)
						|| e.getODataExceptionType().equals(ODataExceptionType.ODATA_OPERATION_EXECUTION_FAILED)) {
					throw e;
				} else {
					String completeUrl = this.serviceName + "/$metadata";
					this.isCacheRefresh = true;// set the isCacheRefresh to true so the entry in the cache is removed for the particular cacheKey.
					if (entityCreated && location != null) {
						return getResponseFromLocation(completeUrl, null);
					} else {
						throw e;
					}
				}
			}
		} else {
			result = create(httpClient);
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "CREATE " + withSeparator(SEPARATOR_PATH, serviceName, entitySet);
	}
}