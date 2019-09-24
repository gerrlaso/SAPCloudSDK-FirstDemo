package com.gerlaso.sap.cloud.sdk.odata;

import org.apache.http.client.HttpClient;
import com.sap.cloud.sdk.cloudplatform.connectivity.WithDestinationName;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;

public interface ODataCreateRequest {

	/**
	 * Executes the OData Create request represented by this object.
	 * @param destinationName
	 * @return ODataCreateResult
	 * @throws ODataException
	 */
	public ODataCreateResult execute(String destinationName) throws ODataException;

	/**
	 * Executes the OData Create request represented by this object.
	 * @param withDestinationName
	 * @return ODataCreateResult
	 * @throws ODataException
	 */
	public ODataCreateResult execute(final WithDestinationName withDestinationName) throws ODataException;
	/**
	 * Executes the OData Create request represented by this object.
	 * @param providedClient custom HttpClient capable of connecting to the data source
	 * @return ODataCreateResult
	 * @throws ODataException
	 */
    public ODataCreateResult execute(HttpClient providedClient) throws ODataException;
    
}
