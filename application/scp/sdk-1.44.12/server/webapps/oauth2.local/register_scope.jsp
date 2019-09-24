<%@page import="com.sap.cloud.security.oauth2.as.commons.client.ClientType"%>
<%@page import="com.sap.cloud.security.oauth2.as.local.Cst"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css" href="/oauth2.local/styles/login.css"/>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OAUTH 2.0 local runtime - register scope</title>

<script type="text/javascript">
function validateForm(){
	
	var name = document.forms["registrationForm"]["id"].value;
	if (name == null || name == ""){
		messageElement = document.getElementById('boxerrormsg');
	    messageElement.childNodes[0].nodeValue = 'Scope ID must be filled out.';
	    messageElement.className = 'message error';
	    document.forms["registrationForm"]["id"].focus();
	  	return false;
	}
	
	
	var redirectURI = document.forms["registrationForm"]["description"].value;
	if (redirectURI == null || redirectURI == ""){
	  
	  messageElement = document.getElementById('boxerrormsg');
	  messageElement.childNodes[0].nodeValue = 'Scope Description must be filled out.';
	  messageElement.className = 'message error';
	  document.forms["registrationForm"]["description"].focus();
	  return false;
	}
	
	return true;
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
                    <form name="registrationForm" method="post" action=<%= response.encodeURL("/oauth2.local/register_scope") %> onsubmit="return validateForm()">
                        <h2>Scope Registration:</h2>
                        <p class="hidden" id="boxerrormsg">Error</p>
                        <div class="formgroup">
                            <div class="formrow">
                                <label>Scope ID:</label><input type="text" name="<%=Cst.SCOPE_ID%>" tabindex="1" />
                            </div>
                           <div class="formrow">
                                <label>Scope Description:</label><input type="text" name="<%=Cst.SCOPE_DESCRIPTION%>" tabindex="1" />
                           </div>
                        </div>
                        <div class="buttonrow">
                            <input type="submit" class="blue" name="Register" value="Register"/>
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