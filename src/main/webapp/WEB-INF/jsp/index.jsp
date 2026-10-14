<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>在线考试首页</title>
</head>
<body>
    <h3>欢迎 ${loginUser.username}</h3>
    <a href="${pageContext.request.contextPath}/record/list">查看我的成绩和错题</a>
    <hr>
    <h4>现有试题文件列表：</h4>
    <c:forEach items="${paperList}" var="p">
        <div>
            试卷名称：${p.paperName}<br> 
            限时${p.limitTime}分钟<br>
            <a href="${pageContext.request.contextPath}/paper/toExam?paperId=${p.id}">
                <button>开始考试</button>
            </a>
        </div>
    </c:forEach>
</body>
</html>