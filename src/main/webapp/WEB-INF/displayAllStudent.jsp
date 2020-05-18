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
		</div>

	</div>
	<div class=navdiv>
		<a class=navbar href="home">Home</a> <a class=navbar href="add">Add
			Student</a> <a class=navbar href="search">Search Student</a> <a
			class=navbar href="displayStudent">Display All Student</a> <a
			class=navbar href="index2">Professor View</a>
	</div>
	<div class=divred>
		<c:if test="${!empty sessionScope.prof}">
			<c:out value="Logged in as: ${prof.professorName }"></c:out>
		</c:if>
	</div>
	<div class="spacing">
		<h1>List Of All Student in the System</h1>

		<c:forEach var="s" items="${requestScope.students}">
			<div class="flip-card">
				<div class="flip-card-inner">
					<div class="flip-card-front">

						<p>
							First Name:
							<c:out value="${s.firstName}"></c:out>
						</p>
						<p>
							Last Name:
							<c:out value="${s.lastName}"></c:out>
						</p>
						<p>
							SSN:
							<c:out value="${s.ssn}"></c:out>
						</p>
						<p>
							ID:
							<c:out value="${s.studentID}"></c:out>
						</p>
					</div>

					<div class="flip-card-back">
						<p>Only Professors Allowed to Delete</p>
						<form action="deleteStudentServlet" method="post">
							<input type="hidden" value="${s.studentID }" name="id"> <input
								type="submit" value="Delete Student">
						</form>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</body>
</html>