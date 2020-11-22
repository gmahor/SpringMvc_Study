<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
<%@ include file="all_style.jsp"%>
</head>
<body>
	<p class="badge badge-primary">${success}</p>
	<%-- <h1>Welcome, ${user.username}</h1>
	<h1>Your Email is, ${user.email}</h1>
	<h1>Your Password is, ${user.password}</h1> --%>
	<h1>Name is : ${student.name}</h1>
	<h1>${student}</h1>


</body>
</html>