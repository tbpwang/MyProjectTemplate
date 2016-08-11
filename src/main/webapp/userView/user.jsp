<%--
  Created by IntelliJ IDEA.
  User: Wang
  Date: 2016/8/11
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/inc.jsp"%>
<html>
<head>
    <title>Common User Page</title>
</head>
<body>
<c:if test="${sessionScope.user.role != 'user'}">
    <c:redirect url="index.jsp"/>
</c:if>
<h2>User Page</h2>
<hr>
<div id="welcome" style="text-align: right">Welcome: ${sessionScope.user.username}</div>
<hr>
<table border="1">
    <tr bgcolor="#00bfff">
        <th>USER_ID</th>
        <th>USERNAME</th>
        <th>PASSWORD</th>
        <th>ROLE</th>
    </tr>
    <tr>
        <th>${sessionScope.user.id}</th>
        <th>${sessionScope.user.username}</th>
        <th>${sessionScope.user.password}</th>
        <th>${sessionScope.user.role}</th>
    </tr>
</table>
<hr>
<a href="${pageContext.request.contextPath}/user/logout">LOGOUT</a>
</body>
</html>
