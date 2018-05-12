<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
<style>
body {
	background-color: #FFFFFF;
}
</style>
</head>
<body>
	<center>
		<h2>
			${message} ${message2}</h2>
	      
<div align="left">
	<h2>List of current users</h2>
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>User Name</th>
		</tr>
		
		 <c:forEach var = "user" items="${usersList}">
		 <tr>
		 	<td>${user.lastName}</td>
		 	<td>${user.firstName}</td>
		 	<td>${user.userName}</td>
		 </tr>
		 </c:forEach>
	</table>
</div>

	</center>

</body>
</html>