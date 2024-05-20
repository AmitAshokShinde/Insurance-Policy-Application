</ portdolio jsp file is a basically search form where user search their portfolio info by filling id name in serch and the info display on the portfolio table jsp/>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="showportfoliotable" method="post">
<label>User Id</label>
<input type="number" name="protid"><br>
<br>
<input type="submit" name="Submit" value="Search">

</form>

</body>
</html>