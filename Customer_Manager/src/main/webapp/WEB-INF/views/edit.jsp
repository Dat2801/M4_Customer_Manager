
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Customer</title>
</head>
<body>
<h1>Sửa Student</h1>
<form method="post">
    <input type="text" name="name" value="${customer.name}">
    <input type="text" name="email" value="${customer.email}">
    <input type="text" name="address" value="${customer.address}">
    <button type="submit">Edit</button>
</form>
</body>
</html>
