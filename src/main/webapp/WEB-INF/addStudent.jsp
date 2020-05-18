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
    
    <div class=divred>${msg}</div>
    <div class="container">
        <form action="addStudentServlet" method ="post">
          <label for="fname">First Name</label>
          <input type="text" id="fname" name="firstname" placeholder="Your name..">
      
          <label for="lname">Last Name</label>
          <input type="text" id="lname" name="lastname" placeholder="Your last name..">
      
          <label for="uname">SSN</label>
          <input type="text" id="ssn" name="ssn" placeholder="Your Social Security number..">

      
          <input type="submit" value="Submit">
        </form>
      </div>

</body>

</html>