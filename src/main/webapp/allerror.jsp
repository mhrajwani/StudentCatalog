<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isErrorPage="true"%>
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
		</div>

	</div>
	<div class=divred>
		<c:if test="${!empty sessionScope.prof}">
			<c:out value="Logged in as: ${prof.professorName }"></c:out>
		</c:if>
	</div>

	<div class=spacing>
		<h1>Something went really wrong!!! We are very sorry. Please contact admin.</h1>
	
	</div>

</body>

</html>