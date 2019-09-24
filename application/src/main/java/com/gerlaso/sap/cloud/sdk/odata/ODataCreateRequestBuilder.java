package com.gerlaso.sap.cloud.sdk.odata;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.gerlaso.sap.cloud.sdk.odata.ODataCreateRequestImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sap.cloud.sdk.cloudplatform.cache.CacheKey;
import com.sap.cloud.sdk.odatav2.connectivity.ErrorResultHandler;
import com.sap.cloud.servicesdk.prov.jacksonutil.JacksonMapper;

public class ODataCreateRequestBuilder {

  private String serviceName;
  private String entitySetName;
  private Map<String, Object> body = null;
  private ErrorResultHandler<?> errorHandler;
  private Map<String, String> headers = new HashMap<String, String>();
  private Map<String, String> destinationRelevantHeaders = new HashMap<String, String>();
  private Boolean cacheMetadata=false;
  private String navigationProperty = null;
  private Map<String,Object> srcKeyMap = new HashMap<>();
  private URL metadataFilePath;
  private CacheKey cacheKey;
  private boolean isCacheRefresh = false;

  private ODataCreateRequestBuilder(String serviceName, String entitySetName) {
    this.serviceName = serviceName;
    this.entitySetName = entitySetName;
    
  }

  /**
   * Creates an ODataCreateRequestBuilder with the given service and entity name.
   * @param serviceName name of the odata service where the developer wants to execute a Create operation.
   * @param entitySetName name of the entity set, on which the developer wants to execute a Create operation
   * @return ODataCreateRequestBuilder
   */
  public static ODataCreateRequestBuilder withEntity(String serviceName, String entitySetName) {
    return new ODataCreateRequestBuilder(serviceName, entitySetName);
  }

  @Deprecated
  public ODataCreateRequestBuilder withBody(Map<String, Object> entityData) {
    return this.setBody(entityData);
  }
  
  /**
   * Sets the passed map for the payload of an OData create request.
   * @param entityData
   * @return ODataCreateRequestBuilder
   */
  public ODataCreateRequestBuilder withBodyAsMap(Map<String, Object> entityData) {
	    return this.setBody(entityData);
	  }
  
  /**
   * Sets an error handler to this ODataCreateRequestBuilder.
   * @param errorHandler
   * @return ODataCreateRequestBuilder
   */
  public ODataCreateRequestBuilder withErrorHandler(ErrorResultHandler<?> errorHandler) {
	  this.errorHandler = errorHandler;
	return this;
  }
  
  /**
   * Adds a header to the create request.
   * @param key name of the header
   * @param value value of the header
   * @return ODataCreateRequestBuilder
   */
  public ODataCreateRequestBuilder withHeader(String key, String value) {
  	  return withHeader(key, value, false);
    }
    
    /**
     * Adds a header to the create request and optionally to the metadata request as well depending on the value of the 
     * passInAllRequests parameter.
     * @param key name of the header
     * @param value value of the header
     * @param passInAllRequests boolean indicating whether the header is to be passed in all the requests to the backend like $metadata call, CSRF Token fetch etc. made as part of the Create Request call
     * @return ODataQueryBuilder
     */
    public ODataCreateRequestBuilder withHeader(String key, String value, boolean passInAllRequests) {
    	
      if(passInAllRequests)
    	  destinationRelevantHeaders.put(key, value);//These headers are added to the metadata request.
      
      if(key.equals("SAP-PASSPORT") && !passInAllRequests)
          destinationRelevantHeaders.put(key, value);// The header "SAP-PASSPORT" is added to metadata request even though the 'passInAllRequests' us false.
        
      headers.put(key, value);//All headers must be considered for the actual OData operation.
  	  return this;
  	  
    }
  
    /**
     * Enables caching of the metadata of an OData V2 data source. If your application is running on a tenant, then the tenant ID along with the metadata URL is used to form the cache key.
     * @return ODataCreateRequestBuilder
     */
  public ODataCreateRequestBuilder enableMetadataCache() {
	  this.cacheMetadata = true;
	return this;
  }
  
  /**
   * Enables caching of the metadata of an OData V2 data source.
   * @param key {@link com.sap.cloud.sdk.cloudplatform.cache.CacheKey Cache key} containing the ID of the tenant where the application runs. You can also include the user name and other parameters in the cache key.
   * @return ODataCreateRequestBuilder
   */
  public ODataCreateRequestBuilder enableMetadataCache(CacheKey cacheKey){
  	this.cacheKey = cacheKey;
  	this.cacheMetadata = true;
		return this;
  }
  
  /**
   * Replaces the existing metadata in the cache with the latest version from the OData V2 data source.
   * @return ODataCreateRequestBuilder
   */
  public ODataCreateRequestBuilder withCacheRefresh(){
  	this.isCacheRefresh = true;
  	return this;
  }
   
  /**
   * Gets the metadata from the specified path.
   * @param metadataFilePath URL pointing to the metadata information
   * @return ODataCreateRequestBuilder A builder for forming the Create
   */
  public ODataCreateRequestBuilder withMetadata(URL metadataFilePath){
  	this.metadataFilePath = metadataFilePath;
  	return this;
  }
  
  private ODataCreateRequestBuilder setBody(Map<String, Object> entityData) {
    this.body = entityData;
    return this;
  }
  
  /**
   * Builds an ODataCreateRequest from this builder.
   * @return an ODataCreateRequest object.
   */
  public ODataCreateRequest build(){
	  
	  if(navigationProperty == null && srcKeyMap == null)
		  //Simple Create 
         return new ODataCreateRequestImpl(this.serviceName,this.entitySetName,this.body,errorHandler, headers, destinationRelevantHeaders, cacheMetadata,metadataFilePath,cacheKey,isCacheRefresh);
	  else
		  //Create via navigation
		 return new ODataCreateRequestImpl(this.serviceName,this.entitySetName,this.body, navigationProperty, srcKeyMap,errorHandler, headers, destinationRelevantHeaders, cacheMetadata, metadataFilePath,cacheKey,isCacheRefresh);
  }
  
  /**
	 * This method is used to create the request body based on a POJO object
	 * 
	 * @param pojoData - An instance of POJO class 
	 * @return A ODataCreateRequestBuilder 
	 */
  public ODataCreateRequestBuilder withBodyAs(Object pojoData) {
	        ObjectMapper mapper = JacksonMapper.getMapper();
			@SuppressWarnings("unchecked")
			HashMap<String, Object> pojoInMap = mapper.convertValue(pojoData,
					HashMap.class);
			this.setBody(pojoInMap);
			return this;
	  }
  
 
  /**
   * Creates an entity related to a source entity using the navigation property.
   * For this to work, in the OData model, the association referred by the navigation property must be 
   * contained in an association set.
   * 
   * @param navigationProperty Navigation property of the source entity
   * @param keyMap Key of the source entity, which can also be a composite key
   * @return An ODataCreateRequestBuilder object
   */
  public ODataCreateRequestBuilder onNavigationProperty(String navigationProperty , Map<String,Object> keyMap) {
	        this.navigationProperty = navigationProperty;
	        this.srcKeyMap = keyMap ;
			return this;
	  }
}
