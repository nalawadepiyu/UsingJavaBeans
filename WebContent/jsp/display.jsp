<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="userinfo" class="com.User" scope="session"/>
	<jsp:getProperty property="firstName" name="userinfo"/>
	<br/>
	<jsp:getProperty property="lastName" name="userinfo"/>
	<br/>

</body>
</html>