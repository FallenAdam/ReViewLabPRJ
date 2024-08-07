<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ngochien
  Date: 2024/08/02
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@elvariable id="student" type=""--%>
<form:form action="processForm" modelAttribute="student">
First name:<form:input path="firstName"/>
<br><br>
Last name:<form:input path="lastName"/>
<br><br>
    <form:select path="country">
        <form:option value="Brazil" label="Brazil"/>
        <form:option value="China" label="china"/>
        <form:option value="Vietnam" label="Viet Name"/>
    </form:select>
    <br><br>
<input type="submit" value="Submit">

<input type="submit" />
</form:form>

</body>
</html>
