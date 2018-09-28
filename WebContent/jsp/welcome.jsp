<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Object ob = request.getAttribute("errors");
	String errorstring = "";
	if(ob != null)
	{
		errorstring = (String) ob;	
	}
%>
<%= errorstring %>


<form name="form" method="get" action="/UsingJavaBean/WelcmServlet">
  First name: 
  <input type="text" name="firstname">
  <br>
  <br>
  Last name:
  <input type="text" name="lastname">
  <br>
  <br>
  <input type = "submit" value = "Submit"/>
</form>
</body>
</html>