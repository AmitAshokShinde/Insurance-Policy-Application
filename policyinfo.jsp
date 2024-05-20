</ policy form contain the all info related to thr policy like name,years,amount etc. all the data save in the policy sql table>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="policyform" method="post">
	<label>User id:</label>
	<input type="number" name="uid">
	<br>
	<br>
		<label for="policyname">Choose a policy:</label>
		 <select name="policyname" >
			<option value="Lifeinsurance">Life insurance</option>
			<option value="Retirementplans">Retirement plans</option>
			<option value="Healthinsurance">Health insurance</option>
			<option value="Childinsuranceplans">Child insurance plans</option></select>
			<br>
			<br>
			<label>Insurance Tenure in years : </label>
			<input type="number" name="years">
		<br>
			<br>
			<label>Premium Amount : </label>
			<input type="number" name="amount">
		<br>
			<br>
			<label> Sum Insured : </label>
			<input type="number" name="sum">
		<br>
			<br>
			<input type="submit" value="Buy">
	</form>

</body>
</html>