<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1">
    <link rel="stylesheet" type="text/css" href="assets/style.css">
    <title>Student Calalog</title>
</head>

<body>
    <div class=header>
        <div id=title>
            <img id=logo src="image/fdmlogo.png">
        </div>
        <div id=headertitle>
            <p>Student Calalog</p>
            <p>Student View</p>
        </div>

    </div>
        <div class=navdiv>
        <a class=navbar href="home1">Home</a>
        <a class=navbar href="add">Add User</a>
        <a class=navbar href="search">Search User</a>
        <a class=navbar href="delete">Delete User</a>
        <a class=navbar href="displayUser">Display All User</a>
        <a class=navbar href="logoutServlet">Log Out</a>
    </div>

<div class=spacing>
    <h1>Welcome ${user}, Choose you action</h1>
    <button class="button"><a href="add">Add User</a></button>
    <button class="button"><a href="search">Search User</a></button>
    <button class="button"><a href="delete">Delete User</a></button>
    <button class="button"><a href="displayUser">Display All User</a></button>
    <button class="button"><a href="logoutServlet">Log out</a></button>
</div>

</body>

</html>
