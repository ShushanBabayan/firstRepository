<%--
  Created by IntelliJ IDEA.
  User: Levon
  Date: 8/27/2020
  Time: 02:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/add" method="post">
    num1 <input type="text" name="num1"> <br/>
    num2 <input type="text" name="num2"> <br>
    <button type="submit" name="add">Add</button>
    <button type="submit" name="sub">Subtract</button>
    <button type="submit" name="mul">Multiply</button>
</form>
<%--<form action="/subtract" method="get">--%>
<%--    <button type="submit">Subtract</button>--%>
<%--</form>--%>
<%--<form action="/multiply" method="post">--%>
<%--    <button type="submit">Multiply</button>--%>
<%--</form>--%>
</body>
</html>
