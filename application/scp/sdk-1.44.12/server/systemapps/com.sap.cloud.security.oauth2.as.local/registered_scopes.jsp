<%@page import="com.sap.cloud.security.oauth2.as.local.client.LocalClientsStorageAccessor"%>
<%@page import="com.sap.cloud.security.oauth2.as.commons.client.IClientAccessor"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>
<%@page import="com.sap.cloud.security.oauth2.as.local.scopes.LocalScopesAccessor"%>
<%@page import="com.sap.cloud.security.oauth2.as.commons.scopes.IScopesAccessor"%>
<%@page import="com.sap.cloud.security.oauth2.as.commons.scopes.ScopeInfo"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/oauth2.local/styles/login.css" />
<link rel="shortcut icon" type="image/x-icon" href="/oauth2.local/images/favicon.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OAUTH 2.0 local runtime - registered scopes</title>
</head>

<%
	IClientAccessor accessor = new LocalClientsStorageAccessor();
	Map<String, ScopeInfo> scopes = accessor.getScopes(null);	
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
					<% if(scopes != null) { %>
						<h2>Scope Registration:</h2>	
					  
					
						<%for (Iterator<ScopeInfo> iterator = scopes.values().iterator(); iterator.hasNext();) {
					    	ScopeInfo scopeInfo = iterator.next(); %>
							<div class="formgroup">
								<div class="formrow">
									<b>Scope ID:  </b><%=scopeInfo.getId()%>
								</div>
								<div class="formrow">
									<b>Scope Description: </b><%=scopeInfo.getDescription()%>
								</div>
							</div>							
						<%}%>
					<% } else {%>
						<div class="formrow">No scopes are found.</div>
					<% } %>
				</div>
				<form action="register_scope.jsp">
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