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
    <link rel="stylesheet" href="${ctx}/style/css.css">
    <script>
        function checkValid() {
            var p1, p2;
            p1 = document.userRegister.password.value;
            p2 = document.userRegister.re_password.value;
            if (p1 != p2) {
                alert("password is not matched by re_password!")
                document.userRegister.re_password.focus();
                return false;
            } else {
                return true;
            }

        }
    </script>
</head>
<body>
<h2>User Register Page</h2>
<hr>
<div>
    <form name="userRegister" action="${pageContext.request.contextPath}/user/register" method="post">
        <label for="username">USERNAME: </label>
        <input style="width: 10%; a" type="text" id="username" name="username" placeholder="USERNAME" required="required" autofocus="autofocus"><br>
        <label for="password">PASSWORD: </label>
        <input type="password" id="password" name="password" placeholder="PASSWORD" required="required"><br>
        <label for="re_password">RE_PASSWORD: </label>
        <input type="password" id="re_password" name="re_password" placeholder="RE_PASSWORD" required="required"><br>
        <hr>
        <%--<label for="phone">CONTACT_NUMBER: </label>--%>
        <%--<input type="tel" id="phone" name="phone" placeholder="CONTACT_NUMBER" required="required"><br>--%>
        <%--<label for="address">CONTACT_ADDRESS: </label>--%>
        <%--<input type="textarea" id="address" name="address" placeholder="CONTACT_ADDRESS" required="required"><br>--%>
        <input type="submit" onclick="return checkValid()" value="REGISTER">
    </form>
</div>
</body>
</html>
