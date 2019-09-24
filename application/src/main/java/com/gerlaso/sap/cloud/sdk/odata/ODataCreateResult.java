package com.gerlaso.sap.cloud.sdk.odata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpResponse;
import org.apache.olingo.odata2.api.ep.entry.ODataEntry;
import org.apache.olingo.odata2.api.ep.feed.ODataFeed;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sap.cloud.sdk.odatav2.connectivity.batch.ChangeSetResultPart;
import com.sap.cloud.sdk.odatav2.connectivity.internal.ODataHttpResponseWrapper;
import com.sap.cloud.servicesdk.prov.jacksonutil.JacksonMapper;

public class ODataCreateResult extends  ODataHttpResponseWrapper implements ChangeSetResultPart {

	Map<String, Object> resultData = null;

	public ODataCreateResult(HttpResponse httpResponse, Map<String, Object> map) {
		setResponse(httpResponse);
		this.resultData = map;
	}
	
	 public ODataCreateResult(Map<String, Object> map, Map<String, List<String>> headerMap, int statusCode) {
	    this.resultData = map;
	    super.headersMap = headerMap;
	    super.responseStatusCode = statusCode;
	  }

	/**
	 * Returns the create response as a map.
	 * @return
	 */
	public Map<String, Object> asMap() {
		Map<String, Object> finalResult = new HashMap<>();
		for (Entry<String, Object> property : resultData.entrySet()) {

			if (property.getValue() instanceof ODataFeed) {// implies we are handling a Navigation property here
				ODataFeed feed = (ODataFeed) property.getValue();
				List<Map<String, Object>> allChildren = new ArrayList<>();// OData V2 connectivity usage on Neo by sFin

				for (ODataEntry feedEntry : feed.getEntries()) {
					allChildren.add(mapEntryToMap(feedEntry));
				}
				finalResult.put(property.getKey(), allChildren);
			} else {
				finalResult.put(property.getKey(), property.getValue());
			}
		}
		return finalResult;
	}

	Map<String, Object> mapEntryToMap(ODataEntry entry) {
		Map<String, Object> entryData = new HashMap<>();
		Map<String, Object> properties = entry.getProperties();
		for (Entry<String, Object> property : properties.entrySet()) {
			if (property.getValue() instanceof ODataFeed) {// implies we are handling a Navigation property here
				
				ODataFeed feed = (ODataFeed) property.getValue();
				List<Map<String, Object>> allChildren = new ArrayList<>();// OData V2 connectivity usage on Neo by sFin

				for (ODataEntry feedEntry : feed.getEntries()) {
					allChildren.add(mapEntryToMap(feedEntry));
				}
				entryData.put(property.getKey(), allChildren);
				
			} else { // TODO check for Complex Type
				entryData.put(property.getKey(), property.getValue());
			}
		}
		return entryData;
	}
	
	/**
	 * Returns the create response as an object of the class passed under parameter t.
	 * @param t
	 * @return
	 */
	public  <T> T as(Class<T> t)  {
		Map<String, Object> finalResult = this.asMap();
		ObjectMapper mapper = JacksonMapper.getMapper();
		
		try {
			@SuppressWarnings("unchecked")
			T pojo = (T) mapper.convertValue(finalResult, Class.forName(t.getTypeName()));
			return pojo;
		} catch (IllegalArgumentException | ClassNotFoundException e) {
			throw new IllegalArgumentException("Exception in POJO Conversion :",  e.getCause());
		} 
		
	}
}
