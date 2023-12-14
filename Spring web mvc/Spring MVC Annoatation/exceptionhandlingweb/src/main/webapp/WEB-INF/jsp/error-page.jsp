<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body>
    <u><h1 style="color:Red;text-align:center">Error Encountered</h1></u>
    <h2 style="color:brown;text-align:center">Error : ${errorMessage}</h2>
</body>
</html>