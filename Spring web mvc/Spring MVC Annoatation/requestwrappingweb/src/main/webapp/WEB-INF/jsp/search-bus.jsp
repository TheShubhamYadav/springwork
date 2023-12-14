<!DOCTYPE html>
<%@page isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>search bus</title>
</head>
<body bgcolor="black" style="color:orange" >

    <h1>Search Bus</h1>
    <form action="${pageContext.request.contextPath}/availablebus.htm" method="post">
        <table border="1">
            <tr>
                <th>Source</th>
                <th>Destination</th>
                <th>Onward Date</th>
                <th>Bus Types</th>
            </tr>
            <tr>
                <td><input type="text" name="source"/></td>
                <td><input type="text" name="destination"/></td>
                <td><input type="date" name="date"/></td>
                <td><select name="busType">
                        <option value="ac sleeper">AC SLEEPER</option>
                        <option value="non-ac sleeper">NON-AC SLEEPER</option>
                        <option value="ac sitter">AC SITTER</option>
                        <option value="non-ac sitter">NON-AC SITTER</option>
                    </select>
                </td><br>
            </tr>
            <tr>
                <td><input type="submit" value="search bus"/></td>
            </tr>
        </table>
    </form>
</body>
</html>