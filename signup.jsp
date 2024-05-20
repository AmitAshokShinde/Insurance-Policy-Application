</ Thid is the sign page it conatin the user info like name,password ,id,address email etc. all the sign up data is save to the useer sql table >
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="submitData" method="post">
	<label>Login ID :</label>
	<input type="number" name="id" required="required">
	<br>
	<br>
	<label>Password :</label>
	<input type="password" name="password" required="required">
	<br>
	<br>
	<label>Name :</label>
	<input type="text" name="name">
	<br>
	<br>
	<label>Address :</label>
	<input type="text" name="address">
	<br>
	<br>
	<label>Email :</label>
	<input type="email" name="email">
	<br>
	<br>
	<label>Mobile No :</label>
	<input type="number" name="mobileNo">
	<br>
	<br>
	<input type="submit" value="SignUp">
	</form>
</body>
</html>