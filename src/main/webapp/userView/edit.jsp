<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Wang
  Date: 2016/8/11
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/inc.jsp"%>
<html>
<head>
    <title>Edit Page for Admin</title>
</head>
<body>
<c:if test="${sessionScope.user.role != 'admin'}">
    <c:redirect url="index.jsp"/>
</c:if>
<h2>Edit Page for Admin</h2>
<hr>
${requestScope.user}<br>
<form action="${pageContext.request.contextPath}/user/edit" method="post">
    <input type="hidden" name="id" value="${requestScope.user.id}">
    <label for="password">PASSWORD: </label>
    <input type="text" id="password" name="password" value="${requestScope.user.password}">
    <input type="submit" value="MODIFY">
</form>
<%--<table border="1">--%>
    <%--<tr bgcolor="#808080">--%>
        <%--<th>PASSWORD</th>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<th>${requestScope.user.password}</th>--%>
    <%--</tr>--%>
<%--</table>--%>
</body>
</html>
