<%@page isErrorPage="true"%>
<%@page import="com.sap.cloud.security.oauth2.as.commons.client.ClientType"%>
<%@page import="com.sap.security.core.server.csi.IXSSEncoder"%>
<%@page import="com.sap.security.core.server.csi.XSSEncoder"%>
<%@page import="java.io.UnsupportedEncodingException"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css" href="/oauth2.local/styles/login.css"/>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OAUTH 2.0 local runtime - error</title>

</head>
<%  
	String errorAttr = (String) request.getAttribute("error");
	String encodedErrorAttr = "";
	IXSSEncoder xssEncoder = XSSEncoder.getInstance();
	try {
	  if (errorAttr != null) {
		encodedErrorAttr = xssEncoder.encodeHTML(errorAttr).toString();
	  }
	} catch (UnsupportedEncodingException e) {
		encodedErrorAttr = "";
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
          <div class="formgroup">
            <div class="formrow">
              <h2>Error code:</h2>
            </div>
            <div class="formrow">
              <%= encodedErrorAttr %>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="footer">
      <div class="left">
        <a target=_blank href="http://www.sap.com/corporate-en/our-company/legal/copyright/index.epx">Copyright/Trademark</a>
        <a target=_blank href="http://www.sap.com/corporate-en/our-company/legal/privacy.epx">Privacy</a>
        <a target=_blank href="http://www.sap.com/corporate-en/our-company/legal/impressum.epx">Legal Disclosure</a>
      </div>
      <div class="right"></div>
    </div>
  </div>
</body>
</html>