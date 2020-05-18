<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1">
<link rel="stylesheet" type="text/css" href="assets/style.css">
<title>Student Catalog</title>
</head>

<body>
	<div class=header>
		<div id=title>
			<img id=logo src="assets/fdmlogo.png">
		</div>
		<div id=headertitle>
			<h4>Student Catalog</h4>
			<p>Professor View</p>
		</div>
	</div>
	<div class=navdiv>
		<a class=navbar1 href="index2">Home</a> <a class=navbar1 href="add">Add
			Student</a> <a class=navbar1 href="search">Search Student</a> <a
			class=navbar1 href="displayStudent">Display All Student</a> <a
			class=navbar1 href="login">Login</a> <a class=navbar1 href="logout">Log
			Out</a>
	</div>
	<div class=divred>
		<c:if test="${!empty sessionScope.prof}">
			<c:out value="Logged in as: ${prof.professorName }"></c:out>
		</c:if>
	</div>
	<div class=divred>${msg}</div>
	<div class="container">
		<form action="addProfessorServlet" method="post">
			<label for="aname">Create New Professor</label> <input type="text"
				id="aname" name="aname" placeholder="Choose your Name.." required>
			<input type="password" id="password" name="password"
				placeholder="Your password.." required> <input type="submit"
				value="Submit">
		</form>
	</div>
</body>

</html>