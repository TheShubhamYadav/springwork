<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Details</title>
</head>
<body bgcolor="orange" style="color:black">

    <h1 align="center">Account detail</h1>
    <table border="1" align="center">
	    <tr><td>Account No : ${account.accountNo}</tr></td>
	    <tr><td>Name : ${account.accountHolderName}</tr></td>
	    <tr><td>IFSC : ${account.ifscCode}</tr></td>
	    <tr><td>Account Type : ${account.accountType}</tr></td>

	    <tr><td><a href="${pageContext.request.contextPath}/createaccount.htm">back to form page</a></td></tr>
    </table>
</body>
</html>