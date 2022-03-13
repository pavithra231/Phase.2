<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body align="center">

  <center> <h1> Admin Login </h1> </center>   
    <form action="Admincontroller" method="POST">  
        <div class="container">   
        	<input type="hidden" name="command" value="LOGIN" />
            <label>Username : </label>   

            <input type="text" placeholder="Enter Username" name="username" required>  
            <br/>
            <label>Password : </label>   

            <input type="password" placeholder="Enter Password" name="password" required>  
            <br/>
            <button type="submit">Login</button>   
            <br/>
            <input type="checkbox" checked="checked"> Remember me   

        </div>   
    </form>     


</body>
</html> 