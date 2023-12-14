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
    <h2 align="center">Ticket Details</h2><br>
    <h4>pnrNo : ${ticket.pnrNo}</h4>
    <h4>passengerName : ${ticket.passengerName}</h4>
    <h4>source : ${ticket.source}</h4>
    <h4>destination : ${ticket.destination}</h4>
    <h4>boardingDate : ${ticket.boardingDate}</h4>
    <h4>status : ${ticket.status}</h4>
    <h4>fareAmount : ${ticket.fareAmount}</h4>

    <a href="${pageContext.request.contextPath}/enquireticket.htm">home</a>
</body>
</html>