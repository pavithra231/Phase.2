<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align='center'>Insert new subject</h1>
<br>
<form action="Addsubject" method="post">
   <p>ID</p> 
        <input type="number" name="Id"/>
        <br/>
        <p>name</p> 
        <input type="text" name="Name"/>
        <br/>
        <p>shortcut</p> 
        <input type="text" name="shortcut"/>
        <br/><br/>
        <input type="submit" value="submit"/>
    </form>
</body>
</html> 