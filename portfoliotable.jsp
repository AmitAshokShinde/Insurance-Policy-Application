</ this page Display the portfolio info  into the table format />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<table>
<tr>
    <th>User Id</th>
    <th>Policy Name</th>
    <th>Insurance Tenure in years</th>
    <th>Premium Amount</th>
    <th>Sum Insured</th>
  </tr>
  <tr>
  <td>${tid}</td>
  <td>${tname}</td>
  <td>${tyear}</td>
  <td>${tamount}</td>
  <td>${tsum}</td>
  </tr>
  <tr>
  <td>${tid}</td>
  <td>${tname}</td>
  <td>${tyear}</td>
  <td>${tamount}</td>
  <td>${tsum}</td>
  </tr>
</table>
</body>
</html>