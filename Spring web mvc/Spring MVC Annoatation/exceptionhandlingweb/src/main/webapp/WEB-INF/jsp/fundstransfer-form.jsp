<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fund transfer form</title>
</head>
<body bgcolor="yellow" style="color:black">

    <h1 >Fund transfer Form</h1>

    <form:form modelAttribute="fundTransferForm"><br>
        <p style="color:red">
        <form:errors path="*"/><br>
        </p>
        from account : <form:input path="fromAccount"/><br>
        to account : <form:input path="toAccount"/><br>
        amount : <form:input  path="amount"/><br>
        transfer type : <form:select path="transferType">
                    <form:option value="IMPS">IMPS</form:option>
                    <form:option value="RTGS">RTGS</form:option>
                    <form:option value="NEFT">NEFT</form:option>
                   </form:select><br>
        remarks : <form:input path="remarks"/><br>
        <input type="submit" value="transfer"/>
    </form:form>
</body>
</html>