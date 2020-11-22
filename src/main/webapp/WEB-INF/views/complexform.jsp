<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Complex form</title>
<%@include file="all_style.jsp"%>
</head>
<body style="background: #e2e2e2;">
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">
							<u>Complex Form</u>

							<div class="alert alert-danger md-2" role="alert">						
							<form:errors path="student.*"/>
							</div>
						</h3>
						<form action="complexform" method="post">
							<div class="form-group">
								<label for="name">Your Name</label> <input type="text"
									class="form-control" name="name" id="name"
									placeholder="Your Name....">
							</div>
							<div class="form-group">
								<label for="id">Your Id</label> <input type="text"
									class="form-control" name="id" id="id"
									placeholder="Your Id.....">
							</div>

							<div class="form-group">
								<label for="date">Your DOB</label> <input type="text"
									class="form-control" name="date" id="date"
									placeholder="mm/dd/yyyy">
							</div>

							<div class="form-group">
								<label for="courses">Select Courses</label> <select
									name="courses" class="form-control" id="courses" multiple>
									<option>java</option>
									<option>python</option>
									<option>hibernate</option>
								</select>
							</div>

							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="gender" value="male"> <label
										class="form-check-label" for="gender">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="gender" value="female"> <label
										class="form-check-label" for="gender">Female</label>
								</div>
							</div>

							<div class="form-group">
								<label for="type">Student Type</label> <select
									class="form-control" name="type" id="type">

									<option value="oldstudent">Old Student</option>
									<option value="normalstudent">Normal Student</option>
								</select>
							</div>


							<div class="card">

								<div class="card-body">
									<p>Your address</p>

									<div class="form-group">

										<input type="text" name="address.street" class="form-control"
											placeholder="Enter Street">

									</div>

									<div class="form-group">

										<input type="text" name="address.city" class="form-control"
											placeholder="Enter City">
									</div>
								</div>
							</div>


							<button type="submit" class="btn btn-primary mt-2">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>