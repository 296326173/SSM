<%@ page import="com.hang.pojo.Girl" %><%--
  Created by IntelliJ IDEA.
  User: 29632
  Date: 2018/12/30
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
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
