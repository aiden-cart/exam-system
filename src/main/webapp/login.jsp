<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>在线考试系统登录</title>
</head>
<body>
    <h2>学生登录</h2>
    <p style="color:red">${msg}</p>
    <form action="${pageContext.request.contextPath}/login/doLogin" method="post">
        用户名：<input type="text" name="username" value="student"><br>
        密码：<input type="password" name="password" value="123456"><br>
        <input type="submit" value="登录">
    </form>
</body>

</html>