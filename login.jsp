</ This is login page if the user is All ready sign up he can login directly >
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="showDashboard" method="post">
	<label>Login ID :</label>
	<input type="number" name="id" required="required">
	<br>
	<br>
	<label>Password :</label>
	<input type="password" name="password" required="required">
	<br>
	<br>
	<input type="submit" value="Submit">
	</form>


</body>
</html>