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
        Json传参
    </title>
    <script language="JavaScript" src="js/jquery.min.js">
    </script>

    <script language="JavaScript">
        function testForm() {
            $.ajax({
                type: "POST",     //提交方式
                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/demo/testForm.do",    //提交的页面，方法名
                data: $("#myFrom").serialize(),    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    alert(data);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                },
                error: function (err) { //如果执行不成功，那么执行此方法
                    alert("err:" + err);
                }
            });
        }

        function testJson5() {
            var datas = {
                "pageNo": "1",
                "pageSize": "50"
            }
            $.ajax({
                type: "POST",     //提交方式
                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/demo/testJson4.do",    //提交的页面，方法名
                data: "name=John&location=Boston",    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data)
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                },
                error: function (err) { //如果执行不成功，那么执行此方法
                    alert("err:" + err);
                }
            });
        }

    </script>

</head>
<body>
    <form id="form" method="post" action="/demo/testJson5.do" id="myFrom">
        <input type="text" name="corpId" value="200">
        <input type="text" name="jobId" value="201">
        <input type="text" name="wishId" value="202">
        <input type="submit"  value="提交">
    </form>

    <input type="button" value="测试form" onclick="testForm()">
</body>
</html>