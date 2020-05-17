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
            <p>Student View</p>
        </div>

    </div>
        <div class=navdiv>
        <a class=navbar href="home">Home</a>
        <a class=navbar href="add">Add Student</a>
        <a class=navbar href="search">Search Student</a>
        <a class=navbar href="displayStudent">Display All Student</a>
    </div>

<div class=spacing>
    <h1>Welcome, Choose you action</h1>
    <button class="button"><a href="add">Add Student</a></button>
    <button class="button"><a href="search">Search Student</a></button>
    <button class="button"><a href="displayStudent">Display All Student</a></button>
</div>

</body>

</html>
