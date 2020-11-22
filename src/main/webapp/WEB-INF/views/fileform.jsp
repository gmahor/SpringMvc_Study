<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload Image</title>
<%@ include file="all_style.jsp"%>
</head>
<body>

	<div class="container p-5">
		<div class="card bg-info">
			<div class="card-body">
				<h1>Upload Image</h1>
				<form action="uploadimage" method="post" enctype="multipart/form-data">
					<div class="form-group">
						<label for="profile">Select Your Image</label> <input type="file"
							name="profile" class="form-control-file" id="profile">
					</div>
					<button class="btn btn-warning">Upload</button>
				</form>
			</div>
		</div>
	</div>

</body>
</html>