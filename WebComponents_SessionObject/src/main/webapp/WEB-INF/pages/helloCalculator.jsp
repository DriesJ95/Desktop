<%--
  Created by IntelliJ IDEA.
  User: Dries
  Date: 9/6/2019
  Time: 10:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>helloCalculator page</title>
</head>
<body>
<h1>Dit is de helloCalculator.jsp</h1>
Calculator
<form method = 'post' action="helloCalculator"> ${message}<br />
    Result: ${result}<br/>
    <input type='number' name='number' /><br>
    <input type = 'submit' name = 'operation' value='+'>
    <input type = 'submit' name = 'operation'  value='-'>
    <input type = 'submit' name = 'operation'  value='*'>
    <input type = 'submit' name = 'operation'  value='/'>
    <input type = 'submit' name = 'operation'  value='CE'>
    <p> ${sessionList}</p>
</form>
${result}
</body>
</html>
