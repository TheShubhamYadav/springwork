<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PNR Enquiry</title>
</head>
<body>
    <h2 align="center">Ticket Enquiry</h2>
    <form action="${pageContext.request.contextPath}/ticketdetails.htm">
        PNR NO : <input type="text" name="pnrNo"/><br>
                 <input type="submit" value="get details"/>
    </form>
</body>
</html>