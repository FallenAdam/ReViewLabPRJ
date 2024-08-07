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
       <form:options items="${student.countryOptions}" />
    </form:select>
<input type="submit" value="Submit">
</form:form>

</body>
</html>
