<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>${paper.paperName}</title>
    <script>
        // 倒计时逻辑
        let totalMin = ${paper.limitTime};
        let leftSecond = totalMin * 60;
        function countDown(){
            leftSecond--;
            let m = Math.floor(leftSecond / 60);
            let s = leftSecond % 60;
            document.getElementById("time").innerText = m+"分"+s+"秒";
            if(leftSecond <= 0){
                alert("考试时间已用完，自动交卷！");
                document.forms[0].submit();
            }
        }
        setInterval(countDown,1000);
    </script>
</head>
<body>
    <h3>考试剩余时间：<span id="time"></span></h3>
    <form action="${pageContext.request.contextPath}/exam/submit" method="post">
        <input type="hidden" name="paperId" value="${paper.id}">
        <c:forEach items="${paper.questionList}" var="q">
            <div style="margin:10px 0;">
                ${q.id}. ${q.title}<br>
                <input type="radio" name="q${q.id}" value="a">A.${q.optionA}<br>
                <input type="radio" name="q${q.id}" value="b">B.${q.optionB}<br>
                <input type="radio" name="q${q.id}" value="c">C.${q.optionC}<br>
                <input type="radio" name="q${q.id}" value="d">D.${q.optionD}<br>
            </div>
        </c:forEach>
        <input type="submit" value="交卷">
    </form>
</body>
</html>