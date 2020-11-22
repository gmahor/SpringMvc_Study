<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>
	<%
		Integer id = (Integer) request.getAttribute("Id");
		String name = (String) request.getAttribute("name");

		List<String> friends = (List<String>) request.getAttribute("f");
	%>
	<h1>
		Your Id is :
		<%=id%></h1>
	<h1>
		My Name is
		<%=name%></h1>

	<%
		for (String f : friends) {
		%>
		<h1>All Friends : <%=f%></h1>
		<% 
		}
	%>



</body>
</html>