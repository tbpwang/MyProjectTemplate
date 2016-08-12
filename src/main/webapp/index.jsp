<%--
  Created by IntelliJ IDEA.
  User: Wang
  Date: 2016/8/9
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/inc.jsp"%>
<html>
<head>
    <title>Index Page</title>
    <link rel="stylesheet" href="${ctx}/style/css.css">
</head>
<body>
<div>
    <h2>Login Page</h2>
    <hr>
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        <label for="username">USERNAME:</label>
        <input type="text" id="username" name="username" placeholder="USERNAME" value="admin"><br>
        <label for="password">PASSWORD:</label>
        <input type="password" id="password" name="password" placeholder="PASSWORD" value="123"><br>
        <hr>
        <input type="submit" value="LOGIN">
    </form>
</div>

${requestScope.message}
<hr>
<a href="${ctx}/userView/register.jsp">REGISTER</a>
</body>
</html>
