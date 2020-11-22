<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<%@ include file="all_style.jsp"%>
<title>Contact Page!</title>
</head>
<body>

	<div class="container-fluid">
		<div class="card mt-4">
			<div class="card-body">
				<h1 class="text-center">Registration Form</h1>
				<p class="text-center">
					<u>${Desc}</u>
				</p>
				<div class="forms">
					<div class="card">
						<div class="card-body">
							<form action="processform" method="post">
								<div class="form-group">
									<label for="email">Email address</label> <input type="email"
										class="form-control" name="email" id="email"
										aria-describedby="email" placeholer="Email..." required>
								</div>

								<div class="form-group">
									<label for="username">User Name</label> <input type="text"
										class="form-control" name="username" id="username"
										aria-describedby="user" placeholer="User Name...">
								</div>

								<div class="form-group">
									<label for="password">Password</label> <input type="password"
										class="form-control" name="password" id="password"
										placeholer="Password.....">
								</div>

								<button type="submit" class="btn btn-outline-primary">Sign
									Up</button>

							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>