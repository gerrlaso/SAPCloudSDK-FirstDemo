<%@page import="com.sap.cloud.security.oauth2.as.commons.client.InternationalizedClientInfo"%>
<%@page import="com.sap.cloud.security.oauth2.as.local.Cst"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/oauth2.local/styles/login.css" />
<link rel="shortcut icon" type="image/x-icon" href="/oauth2.local/images/favicon.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OAUTH 2.0 local runtime - registered client</title>
</head>

<%
	Object clientInfoObj = request.getAttribute(Cst.CLIENT_REGISTRATION_RESPONSE_ATTRIBUTE);
	InternationalizedClientInfo clientInfo = null;
	
	if(clientInfoObj != null && (clientInfoObj instanceof InternationalizedClientInfo)){
	    clientInfo = (InternationalizedClientInfo)clientInfoObj;
	}
%>

<body>

	<div class="wrap">
		<div class="header">
			<img alt="SAP Accounts" class="header_logo"
				src="/oauth2.local/images/empty.gif" />
		</div>
		<div class="main login">
			<div class="content fullwidth">
				<div class="login_spname">
					<h1>OAUTH 2.0 local runtime</h1>
				</div>
				<div class="login_form">
					<% if(clientInfo != null) {%>
						<h2>Client Registration:</h2>						
						<div class="formgroup">
							<div class="formrow">
								<b>Client ID: </b><%=clientInfo.getClientId()%>
							</div>
							<div class="formrow">
								<b>Client Secret: </b><%=clientInfo.getSecret()%>
							</div>
							<div class="formrow">
								<b>Client Secret Issued At: </b><%=clientInfo.getSecretIssuedAt()%>
							</div>
							<!-- div class="formrow">
								<b>Client Secret Expires In: </b><%=clientInfo.getSecretExpiresIn()%>
								days
							</div-->
						</div>
						<div class="formgroup">
							<div class="formrow">
								<%if(clientInfo.getTokenExpiresIn() > 0) {%>
									<b>Token Lifetime: </b><%=clientInfo.getTokenExpiresIn()%> sec
								<% } else {%> 
									<b>Token Lifetime:  </b>Unlimited
								<%} %>
							</div>
							<div class="formrow">
								<%if (clientInfo.getRefreshTokenExpiresIn() > 0) {%>
									<b>Refresh Token Lifetime: </b><%=clientInfo.getRefreshTokenExpiresIn()%> sec
								<% } else {%> 
									<b>Refresh Token Lifetime:  </b>Unlimited
								<%} %>
							</div>
							<div class="formrow">
								<%if (clientInfo.getAuthzCodeExpiresIn() > 0) {%>
									<b>Authorization Code Lifetime: </b><%=clientInfo.getAuthzCodeExpiresIn()%> sec
								<% } else {%> 
									<b>Authorization Code Lifetime:  </b>Unlimited
								<%} %>
							</div>
						</div>												
					<% } else {%>
						<div class="formrow">No client registration response found.</div>
					<% } %>
				</div>
				<form action="register_client.jsp">
					<div class="buttonrow">
						<input type="submit" class="blue" value="Register More"/>
					</div>   
				</form>
				<form action="registered_clients.jsp">
					<div class="buttonrow">
						<input type="submit" class="blue" value="See all clients"/>
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
