<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<center>
<h1>Student Rest Implementation</h1>

<p><b><i>The main purpose if this project is to implement REST Web Services using Spring Boot</i></b></p>
</center>

<p>
<h3>Using POSTMAN tool/browser the following urls can be used to Read, Delete, Update data into the H2 in memory database: </h3>
<h4>To fetch all students: </h4>
<h5>GET</h5>
<i>localhost:8080/students</i>

<h4>To fetch a particular student with student id: </h4>
<h5>GET</h5>
<i>localhost:8080/student/id</i>

<h4>To add new student: </h4>
<h5>POST</h5>
<i>localhost:8080/students</i>

<h4>To delete a student: </h4>
<h5>DELETE</h5>
<i>localhost:8080/student/id</i>

<h4>To update a student: </h4>
<h5>PUT</h5>
<i>localhost:8080/student</i>
</p>
	
</body>
</html>