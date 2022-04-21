<%@ page pageEncoding="UTF-8"%>
<html>
<body>
<h2>${message}</h2>
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名:<input type="text" name="name" /><br>
    密码:<input type="text" name="age" /><br>
    <input type="submit" value="登录" />
</form>
</body>
</html>