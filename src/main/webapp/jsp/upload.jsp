<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/2/23
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Hello Spring MVC</title>
</head>
<body>
<h2>文件上传</h2>
<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="提交">
</form>
</body>
</html>


