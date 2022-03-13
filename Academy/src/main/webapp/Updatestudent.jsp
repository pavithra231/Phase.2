<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align='center'>Update exixting students</h1>
<br>
<form action="Updatestudent" method="post">
        <p>fname</p> 
        <input type="text" name="fName"/>
        <br/><br/>
        <p>lname</p> 
        <input type="lname" name="lName"/>
        <br/>
         <p>age</p> 
        <input type="number" name="age"/>
        <br/>
        <p>Class</p> 
        <input type="number" name="class1"/>
        <br/>
        <p>ID</p> 
        <input type="string" name="id"/>
        <br/>
        <input type="submit" value="submit"/>
    </form>

</body>
</html> 
 