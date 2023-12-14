<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Application Form</title>
</head>
<body bgcolor="yellow" style="color:black">

    <h1 >Loan Application Form</h1>

    <form:form modelAttribute="loanApplicationForm"><br>
        <p style="color:red">
        <form:errors path="*"/><br>
        </p>
        First Name : <form:input path="firstName"/><br>
        Last Name : <form:input path="lastName"/><br>
        DOB : <form:input type="date"  path="dob"/><br>
        Gender : <form:radiobutton path="gender" value="male"/>
                 <form:radiobutton path="gender" value="female"/><br>
        Mobile : <form:input path="mobile"/><br>
        Email : <form:input path="email"/><br>
        LoanType : <form:select path="loanType">
                    <form:option value="car">Car Loan</form:option>
                    <form:option value="home">Home Loan</form:option>
                    <form:option value="business">Business Loan</form:option>
                    <form:option value="personal">Personal Loan</form:option>
                   </form:select><br>
        LoanAmount : <form:input path="loanAmount"/><br>
        Tenure(in months) : <form:input path="tenure"/><br>
        <input type="submit" value="apply"/>
    </form:form>
</body>
</html>