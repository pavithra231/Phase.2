
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <body>
    <form action="create" method="post">
        <p>Name</p> 
        <input type="text" name="PName"/>
        <br/>
        <p>City</p> 
        <input type="text" name="PCity"/>
        <br/><br/>
        <p>Value</p> 
        <input type="number" name="PValue"/>
        <br/>
        <input type="submit" value="Create"/>
    </form>
  <br>
<a href="fetch">Fetch the List</a>
</body>
</html> 