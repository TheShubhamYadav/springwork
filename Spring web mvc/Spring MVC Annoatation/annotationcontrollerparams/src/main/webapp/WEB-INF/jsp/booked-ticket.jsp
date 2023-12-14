<%@page language="java" contentType="text/html; charset=ISO-8859-1"
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
    <h4>pnrNo : ${pnrNo}</h4>
    <h4>passengerName : ${passengerName}</h4>
    <h4>source : ${source}</h4>
    <h4>destination : ${destination}</h4>
    <h4>boardingDate : ${boardingDate}</h4>
    <h4>Identity proof : ${identityType}</h4>
    <h4>Identity No : ${idNo}</h4>
    <h4>Amount paid : ${fareAmount} Rs.</h4>

    <a href="${pageContext.request.contextPath}/bookingpage1.htm">book more ticket</a>
</body>
</html>