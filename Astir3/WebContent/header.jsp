<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<style><%@include file="style.css" %></style>
	<style><%@include file="bootstrapLib/css/bootstrap.min.css" %></style>
		<style><%@include file="bootstrapLib/js/bootstrap.min.js" %></style>
		<style><%@include file="bootstrapLib/js/bootstrap.min.js" %></style>
	<meta charset="ISO-8859-1">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-link bg-link" >

		<img class="astirimg" src="img/astir.png">
		<div class="cvoci text-center">
			<div class="collapse navbar-collapse text-center" id="navbarNavDropdown">

				<ul class="navbar-nav nav text-center"> 

					<li class="nav-item active">
						<a class="nav-link" href="index.jsp">HOME<span class="sr-only">(current)</span></a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="giochiIndex.jsp">GAMES</a>
					</li>

					<li class="nav-item">
						<a class="nav-link" href="rank.jsp">RANK</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#">ABOUT US</a>
					</li>

				</ul>

			</div>
		</div>
		<div class="dropdown">
			<a class="btn dropdown-toggle" role="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				<svg class="bi bi-person text-primary" width="32" height="32" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
					<path fill-rule="evenodd" d="M15 16s1 0 1-1-1-4-6-4-6 3-6 4 1 1 1 1h10zm-9.995-.944v-.002zM5.022 15h9.956a.274.274 0 00.014-.002l.008-.002c-.001-.246-.154-.986-.832-1.664C13.516 12.68 12.289 12 10 12c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664a1.05 1.05 0 00.022.004zm9.974.056v-.002zM10 9a2 2 0 100-4 2 2 0 000 4zm3-2a3 3 0 11-6 0 3 3 0 016 0z" clip-rule="evenodd">
					</path>
				</svg>
			</a>
			<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
				<a class="dropdown-item dd" href="loginCss.html">LOGIN</a>
				<a class="dropdown-item dd" href="registrati.html">SUBSCRIBE</a>
			</div>
		</div>	
		<img  class="etlaboraimg" src="img/etlabora.png">
	</nav>
</body>
</html>