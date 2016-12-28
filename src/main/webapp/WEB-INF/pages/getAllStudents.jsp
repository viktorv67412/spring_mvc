<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: viktor
  Date: 12/28/16
  Time: 05:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table border="2" ; align="center">
    <c:forEach items="${students}" var="student">
        <tr>
            <td>
                <c:out value="${student}"/>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="<spring:url value="/students/init"/>">Go to main page</a>
</body>
</html>
