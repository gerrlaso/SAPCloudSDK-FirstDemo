<%@page import="com.sap.cloud.security.oauth2.as.commons.client.ClientType"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="com.sap.cloud.security.oauth2.as.commons.client.IClientAccessor"%>
<%@page import="com.sap.cloud.security.oauth2.as.local.client.LocalClientsStorageAccessor"%>
<%@page import="com.sap.cloud.security.oauth2.as.commons.client.ClientInfo"%>
<%@page import="com.sap.cloud.security.oauth2.as.commons.client.InternationalizedClientInfo"%>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/oauth2.local/styles/login.css" />
<link rel="shortcut icon" type="image/x-icon" href="/oauth2.local/images/favicon.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OAUTH 2.0 local runtime - registered clients</title>
</head>

<%
  IClientAccessor accessor = new LocalClientsStorageAccessor();
	Set<String> ids = accessor.getClientIDs();
	Map<String, InternationalizedClientInfo> clients = new HashMap<String, InternationalizedClientInfo>();
	for(String id : ids){
	  clients.put(id, accessor.getInternationalizedClientByID(id, null));
	}
%>

<body>
	<div class="wrap">
		<div class="header">
			<img alt="SAP Accounts" class="header_logo" src="/oauth2.local/images/empty.gif" />
		</div>
		<div class="main login">
			<div class="content fullwidth">
				<div class="login_spname">
					<h1>OAUTH 2.0 local runtime</h1>
				</div>
				<div class="login_form">
					<% if(!clients.isEmpty()) { %>
						<h2>Registered clients:</h2>

						<%for (Iterator<InternationalizedClientInfo> iterator = clients.values().iterator(); iterator.hasNext();) {
						  InternationalizedClientInfo clientInfo = iterator.next(); %>
							<div class="formgroup">
								<div class="formrow">
									<b>Client ID: </b><%=clientInfo.getClientId()%> 	<p/>
									<b>Client Name: </b><%=clientInfo.getName()%> 	<p/>
								
									<%if(clientInfo.getClientType() == ClientType.CONFIDENTIAL) {%>

										<b>Client Secret: </b><%=clientInfo.getSecret()%> <p/>
										<!--b>Client Secret Issued At: </b><%=clientInfo.getSecretIssuedAt()%> <p/>									
										<b>Client Secret Expires In: </b><%=clientInfo.getSecretExpiresIn()%> days <p/-->
									<%} %>
								
									<%if(clientInfo.getTokenExpiresIn() > 0) {%>
										<b>Token Lifetime: </b><%=clientInfo.getTokenExpiresIn()%> sec
									<% } else {%>
										<b>Token Lifetime:  </b>Unlimited
									<%} %>
									<p/>
									<%if (clientInfo.getRefreshTokenExpiresIn() > 0) {%>
										<b>Refresh Token Lifetime: </b><%=clientInfo.getRefreshTokenExpiresIn()%> sec
									<% } else {%>
										<b>Refresh Token Lifetime:  </b>Unlimited
									<%} %>
									<p/>
									<%if (clientInfo.getAuthzCodeExpiresIn() > 0) {%>
										<b>Authorization Code Lifetime: </b><%=clientInfo.getAuthzCodeExpiresIn()%> sec
									<% } else {%>
										<b>Authorization Code Lifetime:  </b>Unlimited
									<%} %>
								</div>
							</div>
						<%}%>
					<% } else {%>
						<div class="formrow">No clients are found.</div>
					<% } %>
				</div>
				<form action="register_client.jsp">
					<div class="buttonrow">
						<input type="submit" class="blue" value="Register More"/>
					</div>   
				</form>
				<form action="index.jsp">
					<div class="buttonrow">
						<input type="submit" class="blue" value="Home"/>
					</div>   
				</form>
			</div>
		</div>
		<div class="footer">
			<div class="left">
				<a target=_blank
					href="http://www.sap.com/corporate-en/our-company/legal/copyright/index.epx">Copyright/Trademark</a>
				<a target=_blank
					href="http://www.sap.com/corporate-en/our-company/legal/privacy.epx">Privacy</a>
				<a target=_blank
					href="http://www.sap.com/corporate-en/our-company/legal/impressum.epx">Legal Disclosure</a>
			</div>
			<div class="right"></div>
		</div>
	</div>
</body>
</html>