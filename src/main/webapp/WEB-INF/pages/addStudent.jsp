<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: viktor
  Date: 12/27/16
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add students</title>
</head>
<body>

<form:form method="POST" action="/web/students/add">

    <p>Name</p>
    <form:input path="name"/>

    <p>Age</p>
    <form:input path="age"/>

    <p>Email</p>
    <form:input path="email"/>

    <p>
        <input type="submit" value="Submit"/>
    </p>

</form:form>
<a href="<spring:url value="/statistics/list"/>">Go to staitistic page</a>
</body>
</html>
