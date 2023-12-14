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
    <h1>Book Ticket</h1>
        <form action="${pageContext.request.contextPath}/bookedticket.htm" >
            ID Type : <input type="text" name="identityType"/><br>
            ID No.    : <input type="text" name="idNo"/><br>
            <input type="submit" value="pay & Book"/><br>
        </form>
</body>
</html>