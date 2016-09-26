<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="WangJun">

    <title>
        学生登录
    </title>


</head>
<body>
    <form action="/demo/login.do" method="post">
        学号:<input type="text" name="stuNumber">
        密码:<input type="password" name="stuPassword">
        <input type="submit" value="提交">
    </form>
</body>
</html>