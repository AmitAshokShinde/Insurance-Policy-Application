</ delete policy it conatin the policy namme which can user delete>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="submitdeleteinfo" method="post">
	<label for="policyname">Choose a policy:</label>
		 <select name="policyname" >
			<option value="Lifeinsurance">Life insurance</option>
			<option value="Retirementplans">Retirement plans</option>
			<option value="Healthinsurance">Health insurance</option>
			<option value="Childinsuranceplans">Child insurance plans</option></select>
			<br>
			<br>
	<input type="submit" value="Delete">
	</form>


</body>
</html>