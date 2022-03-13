<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align='center'>Insert new Student</h1>
<br>
<form action="Addstudents" method="post">
   <p>ID</p> 
        <input type="number" name="id"/>
        <br/>
        <p>fname</p> 
        <input type="text" name="fName"/>
        <br/>
        <p>lname</p> 
        <input type="text" name="lName"/>
        <br/><br/>
        <p>age</p> 
        <input type="number" name="age"/>
        <br/>
        <p>class</p> 
        <input type="number" name="class1"/>
        <br/>
        <input type="submit" value="submit"/>
    </form>
</body>
</html> 