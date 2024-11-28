<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<form action="/display-discount" method="post">
    <input type="text" name="desc" placeholder="Product description">
    <input  type="number" name="price" placeholder="List price">
    <input  type="number" name="percent" placeholder="Discount percent">
    <input type="submit" id="submit" value="calculate">
</form>
</body>
</html>