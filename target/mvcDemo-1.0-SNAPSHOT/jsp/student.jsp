<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test1</title>
</head>
<body>　　　 　<!-- 首先我们需要在浏览器中访问到这个jsp页面,填写内容后提交表单,浏览器就会收到 /user/param01.do 这个请求,然后转交给tomcat -->
<form method="get" action="${pageContext.request.contextPath}/request/">
    姓名：<input type="text" name="name">
    <br>
    年龄：<input type="text" name="age">
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>