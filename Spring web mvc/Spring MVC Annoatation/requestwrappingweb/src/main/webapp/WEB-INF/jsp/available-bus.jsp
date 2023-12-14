<!DOCTYPE html>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Available Buses</title>
</head>
<body bgcolor="orange">
    <h2>Available Buses</h2>
    <table border="1">
        <tr>
            <th>Bus Operator</th>
            <th>Bus Type</th>
            <th>Departure</th>
            <th>Duration</th>
            <th>Arrival</th>
            <th>Rating</th>
            <th>Seat Available</th>
        </tr>
        <c:forEach items="${availableBus}" var="bus">
            <tr>
                <td>${bus.operator}</td>
                <td>${bus.busType}</td>
                <td>${bus.departure}</td>
                <td>${bus.duration}</td>
                <td>${bus.arrival}</td>
                <td>${bus.rating}</td>
                <td>${bus.seatAvailable}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>