<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align='center'>Insert new Teacher</h1>
<br>
<form action="Addteacher" method="post">
   <p>ID</p> 
        <input type="number" name="id"/>
        <br/>
        <p>name</p> 
        <input type="text" name="Name"/>
        <br/>
        <p>subject</p> 
        <input type="text" name="subject"/>
        <br/><br/>
        <p>age</p> 
        <input type="number" name="age"/>
        <br/>
        <input type="submit" value="submit"/>
    </form>
</body>
</html> 
 