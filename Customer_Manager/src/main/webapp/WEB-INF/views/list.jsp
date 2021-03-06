<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
<h1>List Customer</h1>
<table style="border-collapse: collapse; border: 1px solid black">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
    </tr>
    <c:forEach items="${customerList}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.email}</td>
            <td>${list.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
