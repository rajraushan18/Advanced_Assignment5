<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Library Management</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/css/bootstrap.min.css"
	integrity="sha384-r4NyP46KrjDleawBgD5tp8Y7UzmLA05oM1iAEQ17CSuDqnUK2+k9luXQOfXJCJ4I"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css"
	href=<c:url value="/resources/loginPage.css" />>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js"
	integrity="sha384-oesi62hOLfzrys4LxRF63OJCXdXDipiYWBnvTl9Y9/TRlw5xlKIEHpNyvvDShgf/"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light text-center">
		<a class="navbar-brand" href="#">Login</a>
	</nav>
	<div class="container">
		<form method=post action="processform">
			<div class="form-group input-field row">
				<label for="inputEmail" class="col-sm-2 col-form-label">Username
					<span class="asterisk">*</span>
				</label>
				<div class="col-sm-10">
					<input type="text" class="form-control inputText" id="inputEmail"
						placeholder="Username" name="username">
				</div>
			</div>
			<div class="form-group input-field row">
				<label for="inputPassword" class="col-sm-2 col-form-label">Password
					<span class="asterisk">*</span>
				</label>
				<div class="col-sm-10">
					<input type="password" class="form-control inputText"
						id="inputPassword" placeholder="Password" name="password">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-10">
					<input type="submit" class="float-right btn btn-primary"
						value="Login>>">
				</div>
			</div>
		</form>
	</div>

</body>
</html>