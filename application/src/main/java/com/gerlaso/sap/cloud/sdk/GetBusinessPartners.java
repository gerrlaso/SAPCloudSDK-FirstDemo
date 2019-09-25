package com.gerlaso.sap.cloud.sdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.sap.cloud.sdk.cloudplatform.connectivity.AuthenticationType;
import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultHttpDestination;
import com.sap.cloud.sdk.cloudplatform.connectivity.ProxyType;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.businesspartner.BusinessPartner;
import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.businesspartner.BusinessPartnerAddress;
import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.businesspartner.BusinessPartnerFluentHelper;
import com.sap.cloud.sdk.s4hana.datamodel.odata.services.DefaultBusinessPartnerService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/get/bp")
public class GetBusinessPartners extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(GetBusinessPartners.class);

    @Override
    protected void doGet( final HttpServletRequest request, final HttpServletResponse response )
        throws IOException
    {
        
    	try {
    		
	    	DefaultHttpDestination oDestination = null;
			oDestination = DefaultHttpDestination.builder("https://myXXXXXX-api.s4hana.ondemand.com")
					.authenticationType(AuthenticationType.BASIC_AUTHENTICATION)
					.name("ErpQueryEndpoint")
					.network(ProxyType.INTERNET)
					.user("USER")
					.password("PASSWORD")
					.build();
			
	    	BusinessPartnerFluentHelper oService = new DefaultBusinessPartnerService()
	                .getAllBusinessPartner()
	                .select(BusinessPartner.ALL_FIELDS,
	                		BusinessPartner.TO_BUSINESS_PARTNER_ADDRESS.select(
	                				BusinessPartnerAddress.STREET_NAME)
	                );
    	
	    	List<BusinessPartner> businessPartners = oService.execute(oDestination);
			
			response.setContentType("application/json");
            response.getWriter().write(new Gson().toJson(businessPartners));

        } catch (final ODataException e) {
            logger.error(e.getMessage(), e);
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write(e.getMessage());
        }
    	
    }
}

