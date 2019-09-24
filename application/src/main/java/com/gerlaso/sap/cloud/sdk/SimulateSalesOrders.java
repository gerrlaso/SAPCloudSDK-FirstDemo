package com.gerlaso.sap.cloud.sdk;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.Header;
import org.apache.http.HttpHeaders;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gerlaso.sap.cloud.sdk.utils.BasicAuth;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.gerlaso.sap.cloud.sdk.odata.ODataCreateRequest;
import com.gerlaso.sap.cloud.sdk.odata.ODataCreateRequestBuilder;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;

/**
 * Servlet implementation class SimulateSalesOrders
 */
@WebServlet("/simulate")
public class SimulateSalesOrders extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimulateSalesOrders() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> oBody = null;
		
		/**
         * Read JSON from a file into a Map
         */
        try {
        	
        	File oFile = new File("/home/gerrlaso/fTrash/testing.json");
            oBody = mapper.readValue(oFile, new TypeReference<Map<String, Object>>() {});
 
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		String basicAuth = BasicAuth.encode("SCP_TEST", "LaboratorioEchevarne.01");
		Header auth = new BasicHeader(HttpHeaders.AUTHORIZATION, basicAuth);
		List<Header> headers = Lists.newArrayList(auth);
		CloseableHttpClient httpClient = HttpClients.custom()
				.setDefaultHeaders(headers)
				.build();

		ODataCreateRequest createRequest =
		     ODataCreateRequestBuilder
		    .withEntity("https://my303074-api.s4hana.ondemand.com/sap/opu/odata/sap/API_SALES_ORDER_SIMULATION_SRV", "A_SalesOrderSimulation")
		    .withBodyAsMap(oBody)
		    .build();
		
        try {
        	
        	response.setContentType("application/json");
			response.getWriter().write(new Gson().toJson(createRequest.execute(httpClient).asMap()));
			
		} catch (ODataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
