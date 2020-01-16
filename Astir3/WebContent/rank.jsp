<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style><%@include file="style.css" %></style>
	<style><%@include file="bootstrapLib/css/bootstrap.min.css" %></style>
	<style><%@include file="bootstrapLib/js/bootstrap.min.js" %></style>
<meta charset="ISO-8859-1">
<title>Ranking</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h3 class="font-italic med" align="center">Medal</h3>
&nbsp
<table class="table table-bordered table-striped tab shadow p-3 mb-5 bg-white rounded" >
		<thead class="bg-primary" style="color: white">
			<tr align="center">
				<th scope="col"></th>
				<th scope="col" >Snake</th>
				<th scope="col" >Pac-Man</th>
				<th scope="col" >Solitario</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">Best Player</th>
				<td align="center">Batman</td>
				<td align="center">Capitàn Spain</td>
				<td align="center">Wonder Woman</td>
			</tr>
			<tr>
				<th scope="row">High Score</th>
				<td align="center">10000</td>
				<td align="center">9000</td>
				<td align="center">7000</td>
			</tr>
		</tbody>
	</table>
&nbsp
&nbsp
<h3 class="font-italic med" align="center">Best Country's Player</h3>
&nbsp
	<table class="table table-bordered table-striped tab shadow p-3 mb-5 bg-white rounded">
		<thead class="bg-primary" style="color: white">
			<tr align="center">
				<th scope="col"></th>
				<th scope="col" >Snake</th>
				<th scope="col" >Pac-Man</th>
				<th scope="col" >Solitario</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">Best Player</th>
				<td align="center">Batman</td>
				<td align="center">Capitàn Spain</td>
				<td align="center">Wonder Woman</td>
			</tr>
			<tr>
				<th scope="row">High Score</th>
				<td align="center">10000</td>
				<td align="center">9000</td>
				<td align="center">7000</td>
			</tr>
		</tbody>
	</table>
</body>
</html>