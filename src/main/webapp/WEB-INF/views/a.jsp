<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>A Class</title>
<%@include file="all_style.jsp"%>
</head>
<body>

	<div class="container">
		<h1 class="text-center">A Class</h1>

		<div class="card">
			<div class="card-body">

				<form action="process" method="post">


					<input name="aclass" id="aclass" class="form-control"
						placeholer="Enter Something...">

					<div class="container my-2 text-center">

						<button type="submit" class="btn btn-success">Add</button>

					</div>
				</form>


			</div>


		</div>

	</div>


</body>
</html>