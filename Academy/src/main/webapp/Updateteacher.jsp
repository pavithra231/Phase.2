<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align='center'>Update exixting Teacher</h1>
<br>
<form action="Updateteacher" method="post">
        <p>name</p> 
        <input type="string" name="Name"/>
        <br/>
        <p>subject</p> 
        <input type="text" name="subject"/>
        <br/>
        <p>Age</p> 
        <input type="string" name="age"/>
        <br/>
        <p>ID</p> 
        <input type="string" name="id"/>
        <br/>
        <input type="submit" value="submit"/>
    </form>

</body>
</html> 