<%@page import="com.sap.cloud.security.oauth2.as.commons.client.ClientType"%>
<%@page import="com.sap.cloud.security.oauth2.as.local.Cst"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/oauth2.local/styles/login.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OAUTH 2.0 local runtime - register client</title>
<script type="text/javascript">
	function validateForm() {

		var name = document.forms["registrationForm"]["name"].value;
		if (name == null || name == "") {
			messageElement = document.getElementById('boxerrormsg');
			messageElement.childNodes[0].nodeValue = 'Client Name must be filled out.';
			messageElement.className = 'message error';
			document.forms["registrationForm"]["name"].focus();
			return false;
		}

		var allTypes = document.forms["registrationForm"]["type"];
		var selectedType = false;
		var confidentialClient = false;
		for ( var i = 0; i < allTypes.length; i++) {
			if (allTypes[i].checked) {
				selectedType = true;
			}
			if (allTypes[i].checked && allTypes[i].value == "confidential") {
				confidentialClient = true;
			}
		}

		if (!selectedType) {
			messageElement = document.getElementById('boxerrormsg');
			messageElement.childNodes[0].nodeValue = 'Client Type must be filled out.';
			messageElement.className = 'message error';
			return false;
		}

		if (confidentialClient) {
			var secret = document.forms["registrationForm"]["secret"].value;
			if (secret == null || secret == "") {
				messageElement = document.getElementById('boxerrormsg');
				messageElement.childNodes[0].nodeValue = 'Client Type is confidential so secret must be filled out.';
				messageElement.className = 'message error';
				document.forms["registrationForm"]["secret"].focus();
				return false;
			}
		}

		var redirectURI = document.forms["registrationForm"]["redirect_uri"].value;
		if (redirectURI == null || redirectURI == "") {
			messageElement = document.getElementById('boxerrormsg');
			messageElement.childNodes[0].nodeValue = 'Client Redirect URI must be filled out.';
			messageElement.className = 'message error';
			document.forms["registrationForm"]["redirect_uri"].focus();
			return false;
		}

		var tokenExpiresIn = document.forms["registrationForm"]["token_expires_in"].value;
		if (tokenExpiresIn != null && tokenExpiresIn != "") {
			var intValue = parseInt(tokenExpiresIn);
			if (Number.isNaN(intValue) || intValue <= 0) {
				messageElement = document.getElementById('boxerrormsg');
				messageElement.childNodes[0].nodeValue = 'Expiration time must be positive integer value.';
				messageElement.className = 'message error';
				document.forms["registrationForm"]["token_expires_in"].focus();
				return false;
			}
		}

		var refreshTokenExpiresIn = document.forms["registrationForm"]["refresh_token_expires_in"].value;
		if (refreshTokenExpiresIn != null && refreshTokenExpiresIn != "") {
			var intValue = parseInt(refreshTokenExpiresIn);
			if (Number.isNaN(intValue) || intValue <= 0) {
				messageElement = document.getElementById('boxerrormsg');
				messageElement.childNodes[0].nodeValue = 'Expiration time must be positive integer value.';
				messageElement.className = 'message error';
				document.forms["registrationForm"]["refresh_token_expires_in"]
						.focus();
				return false;
			}
		}

		var authzCodeExpiresIn = document.forms["registrationForm"]["authz_code_expires_in"].value;
		if (authzCodeExpiresIn != null && authzCodeExpiresIn != "") {
			var intValue = parseInt(authzCodeExpiresIn);
			if (Number.isNaN(intValue) || intValue <= 0) {
				messageElement = document.getElementById('boxerrormsg');
				messageElement.childNodes[0].nodeValue = 'Expiration time must be positive integer value.';
				messageElement.className = 'message error';
				document.forms["registrationForm"]["authz_code_expires_in"]
						.focus();
				return false;
			}
		}
		return true;
	}

	function showPasswordField(show) {
		var secretElement=document.getElementById('clientSecretId');
		var labelElement=document.getElementById('clientSecretLabelId');
		if ( show === "true" ) {
			secretElement.style.display='';
			labelElement.style.display='';
	    } else {
	    	secretElement.style.display='none';
	    	labelElement.style.display='none';
		}
	}
</script>
</head>
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
          <form name="registrationForm" method="post" action="<%=response.encodeURL("/oauth2.local/register_client")%>"
            onsubmit="return validateForm()">
            <h2>Client Registration:</h2>
            <p class="hidden" id="boxerrormsg">Error</p>
            <div class="formgroup">
              <div class="formrow">
                <label>Client Name:</label><input type="text" name="<%=Cst.CLIENT_NAME%>" tabindex="1" />
              </div>
              <div class="formrow">
                <label>Client Description:</label><input type="text" name="<%=Cst.CLIENT_DESCRIPTION%>" tabindex="1" />
              </div>
              <div class="formrow">
                <label>Client Type:</label> 
                <input type="radio" name="<%=Cst.CLIENT_TYPE%>" onchange="showPasswordField('true');" value="<%=ClientType.CONFIDENTIAL%>">
                <%=ClientType.CONFIDENTIAL%>
                <br> <input type="radio" name="<%=Cst.CLIENT_TYPE%>" onchange="showPasswordField('false');" value="<%=ClientType.PUBLIC%>">
                <%=ClientType.PUBLIC%>
                <br>
              </div>
               <div class="formrow">
                <label id="clientSecretLabelId" style="display:none">Secret:</label>
                <input type="text"  name="<%=Cst.CLIENT_SECRET%>" tabindex="1" id="clientSecretId" style="display:none" />
              </div>
              <div class="formrow">
                <label>Client Redirect URI:</label><input type="text" name="<%=Cst.CLIENT_REDIRECT_URI%>" tabindex="1" />
              </div>
              <div class="formrow">
                <label>Client URL:</label><input type="text" name="<%=Cst.CLIENT_URL%>" tabindex="1" />
              </div>
            </div>
            <div class="formgroup">
              <div class="formrow">
                <label>Token Lifetime:</label><input type="text" name="<%=Cst.TOKEN_EXPIRES_IN%>" tabindex="1" /> sec
              </div>
              <div class="formrow">
                <label>Refresh Token Lifetime:</label><input type="text" name="<%=Cst.REFRESH_TOKEN_EXPIRES_IN%>" tabindex="1" /> sec
              </div>
              <div class="formrow">
                <label>Authorization Code Lifetime:</label><input type="text" name="<%=Cst.AUTHZ_CODE_EXPIRES_IN%>" tabindex="1" /> sec
              </div>
            </div>
            <div class="buttonrow">
              <input type="submit" class="blue" name="Register" value="Register" />
            </div>
          </form>
          <form action="index.jsp">
				<div class="buttonrow">
					<input type="submit" class="blue" value="Home"/>
				</div>   
			</form>
        </div>
      </div>
    </div>
    <div class="footer">
      <div class="left">
        <a target=_blank href="http://www.sap.com/corporate-en/our-company/legal/copyright/index.epx">Copyright/Trademark</a> <a
          target=_blank href="http://www.sap.com/corporate-en/our-company/legal/privacy.epx">Privacy</a> <a target=_blank
          href="http://www.sap.com/corporate-en/our-company/legal/impressum.epx">Legal Disclosure</a>
      </div>
      <div class="right"></div>
    </div>
  </div>
</body>
</html>