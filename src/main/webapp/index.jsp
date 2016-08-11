<%--
  Created by IntelliJ IDEA.
  User: Wang
  Date: 2016/8/9
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/inc.jsp"%>>
<html>
<head>
    <title>Index Page</title>
</head>
<body>
<div>
    <h2>Login Page</h2>
    <hr>
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        USERNAME: <input type="text" name="username" placeholder="USERNAME" value="admin"><br>
        PASSWORD: <input type="password" name="password" placeholder="PASSWORD" value="123"><br>
        <input type="submit" value="LOGIN">
    </form>
</div>
<hr>
<a href="${pageContext.request.contextPath}/user/register"></a>
</body>
</html>
