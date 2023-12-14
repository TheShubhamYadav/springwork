<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Order History</title>
</head>
<body>
	<h1 style="text-align: center">Order history</h1>
	<form action="${pageContext.request.contextPath}/orderhistory.htm?viewType=html" method="post">
	    <p>
	       name : Billy Gunn<br>
	       account email : BG@123gmail.com<br>
	       choose months :
	       <select name="months">
	        <option value="3">3 months</option>
	        <option value="6">6 months</option>
	        <option value="9">9 months</option>
	        <option value="12">12 months</option>
	       </select><br>
	       <input type="submit" value"show history"/>
	    </p>
	</form>

    <c:if test="${orderlist ne null}">
      <p>
        download as <a href="${pageContext.request.contextPath}/orderhistory.htm?months=${months}&viewType=xls">XLS</a>
                    or
                    <a href="${pageContext.request.contextPath}/orderhistory.htm?months=${months}&viewType=pdf">PDF</a>
      </p>
      <table style="border:solid">
	        <tr>
            	 <th>order id</th>
            	 <th>ordered date</th>
            	 <th>description</th>
            	 <th>amount</th>
            	 <th>status</th>
            </tr>
            <c:forEach items="${orderlist}" var="order">
	          <tr>
	            <td>${order.orderNo}</td>
	            <td>${order.orderedDate}</td>
	            <td>${order.description}</td>
	            <td>${order.amount}</td>
	            <td>${order.status}</td>
	          </tr>
	        </c:forEach>
	  </table>
    </c:if>
</body>
</html>