<%--
  Created by IntelliJ IDEA.
  User: Dries
  Date: 9/6/2019
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guestbook</title>
</head>
<body>
<h1>Dit is de GuestbookJSP.jsp</h1>
<h2>Current guestbook: </h2>
<p>${guestBookList}</p>
<form method="post" action="servlet">
    <p>Geef hier je naam in: <input type = "text" name="Name"></p>
    <p>Geef hier je boodschap in: <input type = "text" name = "Message"></p>
    <p><input type="submit" name="Add to DB"></p>
</form>
</body>
</html>
