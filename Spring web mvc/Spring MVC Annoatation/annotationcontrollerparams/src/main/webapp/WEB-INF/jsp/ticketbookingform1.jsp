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
    <p>
        <form action="${pageContext.request.contextPath}/bookingpage2.htm" >
            Passenger name : <input type="text" name="passengerName"/><br>
            Source    : <input type="text" name="source"/><br>
            destination : <input type="text" name="destination"/><br>
            Date : <input type="date" name="boardingDate"/><br>
            <input type="submit" value="next>>"/><br>
        </form>
    </p>
</body>
</html>