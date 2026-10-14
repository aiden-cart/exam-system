<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>考试结果</title>
</head>
<body>
    <h2>本次得分：${score} 分</h2>
    <hr>
    <h4>试题答案与难度分析：</h4>
    <c:forEach items="${paper.questionList}" var="q">
        <div>
            题目：${q.title}<br>
            正确答案：${q.answer.toUpperCase()}<br>
            试题使用次数：${q.useCount}<br>
            答错次数：${q.wrongCount}<br>
            难度系数(0~1越大越难)：${q.difficulty}
        </div>
    </c:forEach>
    <a href="${pageContext.request.contextPath}/paper/list">返回首页</a>
</body>
</html>