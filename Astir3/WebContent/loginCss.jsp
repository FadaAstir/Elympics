<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
	<head>
		<style><%@include file="style.css" %></style>
		<style><%@include file="bootstrapLib/css/bootstrap.min.css" %></style>
		<meta charset="ISO-8859-1">
		<title>Login form</title>
		<script>
		$(document).ready(function() {
		    $("#show_hide_password a").on('click', function(event) {
		        event.preventDefault();
		        if($('#show_hide_password input').attr("type") == "text"){
		            $('#show_hide_password input').attr('type', 'password');
		            $('#show_hide_password i').addClass( "fa-eye-slash" );
		            $('#show_hide_password i').removeClass( "fa-eye" );
		        }else if($('#show_hide_password input').attr("type") == "password"){
		            $('#show_hide_password input').attr('type', 'text');
		            $('#show_hide_password i').removeClass( "fa-eye-slash" );
		            $('#show_hide_password i').addClass( "fa-eye" );
		        }
		    });
		});
		</script>
	</head>
	<body>
		<jsp:include page="header.jsp"></jsp:include>
		<form method="GET" action="check_login">
		<div class="log">
			<div class="form-group">
				<label for="exampleInputEmail1">Username</label>
				<input class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
				<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label>
				<div class="input-group" id="show_hide_password">
			      <input class="form-control" type="password">
			      <div class="input-group-addon">
			        <a href=""><i class="fa fa-eye-slash" aria-hidden="true"></i></a>
			      </div>
			    </div>
				<!-- <input type="password" class="form-control" id="pass"> -->
			</div>
			<div class="form-group form-check" align="center">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1" >Remember Me</label>
				<!-- <input type="checkbox" onclick="myFunction()"> Show Password-->
			</div>
			<button type="submit" class="btn btn-primary" style="width: 38.5rem;">Login</button>
		</div>
	</form>
	<p></p>
	<div align="center">
		<a href="registrati.jsp" >Non sei registrato ? Clicca qui ! </a>
	</div>
	</body>
</html>