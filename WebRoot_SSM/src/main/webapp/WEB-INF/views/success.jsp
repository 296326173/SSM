<%@ page import="com.hang.pojo.Girl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Girl girl = (Girl) request.getAttribute("girl");
%>
<html>
<head>
    <title>测试成功</title>
</head>
<body>
success
<%=girl%>
</body>
</html>
