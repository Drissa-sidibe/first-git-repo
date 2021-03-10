<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Welcome to My Login Page</h1>
		
		<p><font style color="red">${errorMessage}</font></p>
		<form action="/login.do" method="post">
			<label for="user">UserName: </label>
			<input type="text" id="user" name="username"><br><br>
			<label for="pass">Password: </label>
			<input type="password" id="pass" name="password"><br><br>
			<input type="submit" value="Login">
		</form>
</body>
</html>
