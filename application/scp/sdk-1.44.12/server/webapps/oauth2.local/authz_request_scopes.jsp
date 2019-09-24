<%@page import="com.sap.cloud.security.oauth2.as.local.client.LocalApplicationResourceServer"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<%@page import="com.sap.cloud.security.oauth2.as.commons.scopes.ScopeInfo"%>
<%@page import="com.sap.cloud.security.oauth2.as.commons.code.AuthzCodeReqData"%>
<%@page import="com.sap.cloud.security.oauth2.as.commons.code.AuthzCodeConstants"%>
<%@page import="com.sap.security.core.server.csi.IXSSEncoder"%>
<%@page import="com.sap.security.core.server.csi.XSSEncoder"%>
<%@page import="java.io.UnsupportedEncodingException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/oauth2.local/styles/login.css" />
<link rel="shortcut icon" type="image/x-icon" href="/oauth2.local/images/favicon.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OAUTH 2.0 local runtime - Authorize</title>
</head>

<%
    AuthzCodeReqData authzReqData = (AuthzCodeReqData) request.getSession().getAttribute(AuthzCodeReqData.autzRequestParamName);
	String generateAuthzCodeServlet = response.encodeURL("/oauth2.local/generate_authz_code");
	
	IXSSEncoder xssEncoder = XSSEncoder.getInstance();
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

					<div class="formrow">
						Authorize client <b><%=authzReqData.getClientName()%></b> to access data of application <b><%=((LocalApplicationResourceServer)authzReqData.getResourceServer()).getApplication()%></b>
					</div>

						<%
						  if (authzReqData.getScopesData() != null && authzReqData.getScopesData().getScopes() != null && authzReqData.getScopesData().getScopes().size() > 0) {
						%>
							<div class="formrow paragraph">
								Client <b><%=xssEncoder.encodeHTML(authzReqData.getClientName())%></b> <span class="allow">will be able to:</span>
							</div>
							<ul>
								<%
								  String encodedScope = null;
								    for (ScopeInfo scope : authzReqData.getScopesData().getScopes()) {
								      try {
								        encodedScope = xssEncoder.encodeHTML(scope.getDescription()).toString();
								      } catch (UnsupportedEncodingException e) {
								        encodedScope = "";
								      }
								%>
									<li><%=encodedScope%></li>
								<% } %>
							</ul>
						<% } %>

						<%if (authzReqData.getScopesData().getUnrequestedScopes() != null) { %>
							<div class="formrow paragraph">
								Client <b><%=xssEncoder.encodeHTML(authzReqData.getClientName())%></b> <span class="deny">will NOT be able to:</span>
							</div>
							<ul>
								<% String encodedScope = null;
								   for (ScopeInfo scope: authzReqData.getScopesData().getUnrequestedScopes()) {
									   try {
										 encodedScope = xssEncoder.encodeHTML(scope.getDescription()).toString();
									   }
									   catch (UnsupportedEncodingException e) {
										 encodedScope = "";
									   }
								%>
									<li><%=encodedScope%></li>
								<% } %>
							</ul>
						<% } %>

						<div class="buttonrow">
							<form method="post" action=<%=generateAuthzCodeServlet %>>
								<input type="submit" class="blue" name="<%= AuthzCodeConstants.ACTION %>" value="<%= AuthzCodeConstants.ACTION_CANCEL %>"/>
							</form>
							<form method="post" action=<%=generateAuthzCodeServlet %>>
			                    <input type="submit" class="blue" name="<%= AuthzCodeConstants.ACTION %>" value="<%= AuthzCodeConstants.ACTION_AUTHORIZE %>"/>
							</form>
                        </div>
				</div>
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