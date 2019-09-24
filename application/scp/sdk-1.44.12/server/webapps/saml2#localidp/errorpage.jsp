<%@page import="java.io.StringWriter"%>
<%@page import="java.io.PrintWriter"%>

<%@ page isErrorPage="true" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Error Page</title>
</head>
<body>
<h3>
	<u><b>Message:</b></u>
</h3>

<%=exception.getMessage()%>

<br>

<h3>
	<u><b>StackTrace:</b></u>
</h3>

<%
	StringWriter strWriter = new StringWriter();
	PrintWriter prWriter = new PrintWriter(strWriter);
	exception.printStackTrace(prWriter);
	out.println(strWriter);
	prWriter.close();
	strWriter.close();
%>
</body>
</html>