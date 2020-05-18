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
	<c:if test="${empty sessionScope.prof}">
		<c:redirect url="login" />
	</c:if>
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
	<div class=spacing>
		<c:choose>
			<c:when test="${success}">
				<h1>Student Deleted Successfully by <c:out value="${prof.professorName }"></c:out></h1>
			</c:when>
			<c:otherwise>
				<h1>User Not Deleted</h1>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>