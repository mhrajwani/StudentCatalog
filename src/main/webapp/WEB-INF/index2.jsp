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
<c:if test="${empty sessionScope.prof}">
	<c:redirect url="login"/>
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
        <a class=navbar1 href="login">login</a>
        <a class=navbar1 href="index2">Home</a>
        <a class=navbar1 href="add">Add Student</a>
        <a class=navbar1 href="search">Search Student</a>
        <a class=navbar1 href="displayStudent">Display All Student</a>
        <a class=navbar1 href="logout">Log Out</a>
    </div>

<div class=spacing>
    <h1>Welcome ${prof.professorName}, Choose you action</h1>
    <button class="button"><a href="add">Add Student</a></button>
    <button class="button"><a href="search">Search Student</a></button>
    <button class="button"><a href="displayStudent">Display All Student</a></button>
    <button class="button"><a href="welcome">Back To Welcome Page</a></button>
</div>
</body>
</html>