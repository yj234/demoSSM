<%@ page pageEncoding="UTF-8"%>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/2/23
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Hello Spring MVC</title>
</head>
<body>
<h2>hello:&nbsp;&nbsp;${user}</h2>
<a href="${pageContext.request.contextPath}/logout">退出登录</a>
</body>
</html>


