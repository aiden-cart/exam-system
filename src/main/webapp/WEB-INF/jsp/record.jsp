<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>我的成绩与错题</title>
</head>
<body>
    <a href="${pageContext.request.contextPath}/paper/list">返回首页</a>
    <hr>
    <h3>历史考试记录</h3>
    <c:forEach items="${recordList}" var="r">
        <div>
            试卷：${r.paper.paperName}<br>
            得分：${r.score}<br>
            考试时间：${r.createTime}
        </div>
    </c:forEach>
    <hr>
    <h3>我的错题本</h3>
    <c:forEach items="${errorList}" var="e">
        <div>
            题目：${e.question.title}<br>
            你的答案：${e.userAnswer.toUpperCase()}<br>
            正确答案：${e.question.answer.toUpperCase()}
        </div>
    </c:forEach>
</body>
</html>