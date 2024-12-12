<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<%@include file="components/css.jsp"%>
</head>
<body style="background-color: #f0f1f2;">
	<%@include file="components/navbar.jsp"%>

	<div class="container">
		<div class="row mt-2">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center">Register Page</h4>
						<form action="Register" method="Post">
							<div class="form-group">
								<label for="InputFullName">Enter full name:</label> <input
									type="text" class="form-control" id="InputFullName"
									required="required" name="fullName">
								<!-- <small id="emailHelp"
									class="form-text text-muted">We'll never share your
									email with anyone else.</small>aria-describedby="emailHelp" -->
							</div>

							<div class="form-group">
								<label for="InputEmail">Enter your email:</label> <input
									type="email" class="form-control" id="InputEmail"
									aria-describedby="emailHelp" required="required" name="email">
								<!-- <small id="emailHelp"
									class="form-text text-muted">We'll never share your
									email with anyone else.</small> -->
							</div>

							<div class="form-group">
								<label for="InputPhoneNumber">Enter your phone number:</label> <input
									type="number" class="form-control" id="InputPhoneNumber"
									required="required" name="phoneNumber">
							</div>

							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" class="form-control" id="exampleInputPassword1"
									required="required" name="passWord">
							</div>
							<div class="form-group form-check">
								<input type="checkbox" class="form-check-input" name="checkBox"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">Check me out</label>
							</div>
							<button type="submit" class="btn btn-primary">Register</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="components/footer.jsp"%>
</body>
</html>