<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Open New Account</title>
</head>
<body bgcolor="orange" style="color:black">

    <h1 align="center">New Account Form</h1>

    <table border="1" align="center">
	 <form:form modelAttribute="accountForm">

	    <p style="color:red;text-align:center">
	        <form:errors path="*"/>
	    </p>

Explore "https://www.javatpoint.com/spring-mvc-form-text-field" radiobutton know spring form tags
		<tr><td> Full Name : <form:input path="fullName"/></td></tr>
		<tr><td> Age : <form:input path="age"/> </tr></td>
		<tr><td> Gender : <form:radiobutton path="gender" value="male" checked="checked"/>male
				 <form:radiobutton path="gender" value="female"/>female </tr></td>
		<tr><td> Id Type : <form:select path="idType">
					        <form:option value="PAN Card"/>PAN Card
					        <form:option value="Aadhar Card" />Aadhar Card
					        <form:option value="Voter Card" />Voter Card
					        <form:option value="Driver Licence" />Driver Licence
				           </form:select>
			            </tr></td>
		<tr><td> ID No. : <form:input path="idNo"/> </tr></td>
		<tr><td> Account Type : <form:select path="accountType">
                                  <form:option value="savings"/>Savings
                                  <form:option value="current"/>Current
		                        </form:select>
        			       </tr></td>
		<tr><td> <input type="submit" value="Open Account"> </tr></td>

	 </form:form>
    </table>
</body>
</html>