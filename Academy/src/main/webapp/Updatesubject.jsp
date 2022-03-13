<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align='center'>Update exixting subjects</h1>
<br>
<form action="Updatesubject" method="post">
        <p>name</p> 
        <input type="text" name="Name"/>
        <br/><br/>
        <p>shortcut</p> 
        <input type="text" name="shortcut"/>
        <br/>
        <p>ID</p> 
        <input type="string" name="Id"/>
        <br/>
        <input type="submit" value="submit"/>
    </form>

</body>
</html> 