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
			${message}
	      <c:forEach var = "i" begin = "1" end = "5">
	         Item <c:out value = "${i}"/><p>
	      </c:forEach>
		</h2>
	</center>

</body>
</html>