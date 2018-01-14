<%--
  Created by IntelliJ IDEA.
  User: yrp
  Date: 2018/1/13
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <base href="${pageContext.request.contextPath}/">
    <title>显示所有学生页面</title>
</head>
<body>
<h1>所有学生信息</h1>
    <c:forEach items="${students}" var="student">
        <div>${student.name}---${student.sex}---${student.age}</div>

    </c:forEach>
</body>
</html>
