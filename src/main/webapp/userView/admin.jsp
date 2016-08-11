<%--
  Created by IntelliJ IDEA.
  User: Wang
  Date: 2016/8/10
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/inc.jsp"%>
<html>
<head>
    <title>Admin Page</title>
    <script>
        function del() {
            return confirm("Are you sure to delete the record?");
        }
    </script>
</head>
<body>
<c:if test="${sessionScope.user.role != 'admin'}">
    <c:redirect url="index.jsp"/>
</c:if>
<h2>Admin Page</h2>
<hr>
<table border="1">
    <tr bgcolor="#00bfff">
        <th>USER_ID</th>
        <th>USERNAME</th>
        <th>PASSWORD</th>
        <th>ROLE</th>
        <th colspan="2">OPERATION</th>
    </tr>
    <c:forEach var="user" items="${sessionScope.allUsers}">
        <tr>
            <th>${user.id}</th>
            <th>${user.username}</th>
            <th>${user.password}</th>
            <th>${user.role}</th>
            <th><a href="${pageContext.request.contextPath}/user/searchById/${user.id}">EDIT</a></th>
            <th><a href="${pageContext.request.contextPath}/user/remove/${user.id}" onclick="return del()">REMOVE</a></th>
        </tr>
    </c:forEach>
</table>
<hr>
<a href="${pageContext.request.contextPath}/user/logout">LOGOUT</a>
</body>
</html>
