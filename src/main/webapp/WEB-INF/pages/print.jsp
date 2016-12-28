<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: viktor
  Date: 12/27/16
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Statistic page</title>
</head>
<body>
<ul>
    <li>name: ${name}</li>
</ul>
<ul>
    <li>age: ${age}</li>
</ul>
<ul>
    <li>email: ${email}</li>
</ul>
</body>
<a href="<spring:url value="/students/init"/>">back</a>
<a href="<spring:url value="/statistics/list"/>">Go to staitistic page</a>
</html>
