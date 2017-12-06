<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DevOps Demo</title>
<style>
body {
	background-color: #808080;
}
</style>
</head>
<body id = "bd">
	<form action = "hello" method = "GET">
	<h3>DevOps Demo</h3>
	<h4>Please enter the following fields</h4>
	Name: <input type = "text" name = "name">
	<br>
	Email: <input type = "text" name = "email">
	<br>
	Phone Number: <input type = "text" name = "phoneNumber">
	<br>
	<br>
	<input type = "submit" value = "Submit" />
	</form>
</body>
</html>