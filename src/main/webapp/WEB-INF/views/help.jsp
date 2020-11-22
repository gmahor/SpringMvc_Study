<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help Page!</title>

<link rel="stylesheet" href='<c:url value="/resources/css/style.css" />'>
<script type="text/javascript" src="<c:url value="/resources/js/script.js" />"></script>

</head>
<body>

	<img src='<c:url value="/resources/image/Apple_watch.jpg" />' alt="">

	<h1>You Are in Help Page!</h1>

	<%
		/* 
				String name = (String) request.getAttribute("name");
		
				LocalDateTime d = (LocalDateTime) request.getAttribute("now");
		
				LocalDate date = (LocalDate) request.getAttribute("date");
		 */
	%>

	<h1>
		Name is :
		<%-- <%=name%> --%>
		${name}
	</h1>


	<h1>
		Date nd Time :
		<%-- <%=d%></h1> --%>
		${now}

	</h1>
	<h1>
		Date :
		<%-- <%=date%></h1> --%>
		${date}

	</h1>


	<h1>phone${p }</h1>

	<c:forEach var="item" items="${p}">
		<h1>Phone : ${item}</h1>
	</c:forEach>




	<%-- 
	<%
		List<String> phone = (List<String>) request.getAttribute("p");

		for (String p : phone) {
	%>

	<h1>
		Phone no :
		<%=p%></h1>

	<%
		}
	%> --%>


</body>
</html>