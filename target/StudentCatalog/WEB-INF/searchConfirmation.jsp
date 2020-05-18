<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1">
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
        <a class=navbar href="home">Home</a>
        <a class=navbar href="add">Add Student</a>
        <a class=navbar href="search">Search Student</a>
        <a class=navbar href="displayStudent">Display All Student</a>
    </div>
<c:choose>
    <c:when test="${student.isEmpty()}">
        <div class="spacing">
			<h1>Student With Matching ${field1} of ${search}</h1>
			<div class="flip-card">
  				<div class="flip-card-inner">
    				<div class="flip-card-front">
      					<h1>Student Does Not Exist</h1>  
    				</div>
    				<div class="flip-card-back">
      					<h1>Student Not in Database</h1> 
    				</div>
  				</div>
			</div>
		</div>
    </c:when>    
    <c:otherwise>
 		<div class="spacing">
			<h1>Student With Matching ${field1} of ${search}</h1>
			<c:forEach var="s" items="${requestScope.student}">
			<div class="flip-card">
  				<div class="flip-card-inner">
    				<div class="flip-card-front">
      
						<p>First Name: <c:out value="${s.firstName}"></c:out></p>
						<p>Last Name: <c:out value="${s.lastName}"></c:out></p>
						<p>SSN: <c:out value="${s.ssn}"></c:out></p>
						<p>ID: <c:out value="${s.studentID}"></c:out></p>
    				</div>

    				<div class="flip-card-back">
    					<p>Only Professors Allowed to Delete</p>
						<form action="deleteStudentServlet" method ="post">
						<input type ="hidden" value ="${s.studentID }" name="id">
						<input type="submit" value="Delete Student">
						</form> 
    				</div>
  				</div>
			</div>
		</c:forEach>
		</div>
    </c:otherwise>
</c:choose>

</body>

</html>