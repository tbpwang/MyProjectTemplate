<%--
  Created by IntelliJ IDEA.
  User: Wang
  Date: 2016/8/11
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/inc.jsp" %>
<html>
<head>
    <title>User Register Page</title>
</head>
<body>
<h2>User Register Page</h2>
<hr>
<div>
    <form action="${pageContext.request.contextPath}/user/register" method="post">
        <label for="username">USERNAME: </label>
        <input type="text" id="username" name="username" placeholder="USERNAME" required="required"><br>
        <label for="password">PASSWORD: </label>
        <input type="password" id="password" name="password" placeholder="PASSWORD" required="required"><br>
        <label for="re_password">RE_PASSWORD: </label>
        <input type="password" id="re_password" name="re_password" placeholder="RE_PASSWORD" required="required"><br>
        <br>
        <%--<label for="phone">CONTACT_NUMBER: </label>--%>
        <%--<input type="tel" id="phone" name="phone" placeholder="CONTACT_NUMBER" required="required"><br>--%>
        <%--<label for="address">CONTACT_ADDRESS: </label>--%>
        <%--<input type="text" id="address" name="address" placeholder="CONTACT_ADDRESS" required="required"><br>--%>
        <input type="submit" value="REGISTER">
    </form>
</div>
</body>
</html>
