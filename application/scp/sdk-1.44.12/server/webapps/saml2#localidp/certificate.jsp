<%@page import="com.sap.security.core.server.csi.XSSEncoder"%>


<%@page import="com.sap.core.jpaas.security.saml2.localidp.cfg.ConfigParser"%>
<%@page import="com.sap.core.jpaas.security.saml2.service.cfg.SAML2ConfigurationJPaaSIdPImpl"%>
<%@page import="com.sap.core.jpaas.security.saml2.service.cfg.SAML2LocalIdPJPaaSImpl"%>

<% 
  SAML2ConfigurationJPaaSIdPImpl idpconf = ConfigParser.getInstance().generateIdpSAML2Configuration();
  if (idpconf == null) {
    throw new Exception ("Problem during creating idp configuration. Metadata can't be generated."); 
  }	      
  String certificate = ((SAML2LocalIdPJPaaSImpl)idpconf.getLocalIdP()).getSigningCertificate();
  
  response.setContentType("application/samlmetadata+xml");
  response.setCharacterEncoding("UTF-8");
  response.setHeader("Content-Disposition", "attachment; filename=\"" + idpconf.getLocalIdP().getName() + "-certificate.xml\"");
  response.getWriter().write(certificate);

%>

<%@ page errorPage="errorpage.jsp" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


