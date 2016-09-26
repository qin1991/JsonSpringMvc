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
    <h2>方法一：好使</h2>
    <form id="form" method="post" action="/form/batch.do">
        <input type="text" name="users[0].name" value="张三"><br/>
        <input type="text" name="users[0].address" value="北京"><br/>
        <input type="text" name="users[0].age" value="20"><br/>
        <hr>
        <input type="text" name="users[1].name" value="李四"><br/>
        <input type="text" name="users[1].address" value="湖南"><br/>
        <input type="text" name="users[1].age" value="22"><br/>
        <hr>
        <input type="submit"  value="提交">
    </form>
    <h2>方法2：</h2>
    <form method="post" action="/form/batch2.do" id="myFrom2">

        <input type="text" name="name" value="张三111"><br/>
        <input type="text" name="address" value="北京111"><br/>

        <input type="text" name="list[0].name" value="张三"><br/>
        <input type="text" name="list[0].address" value="北京"><br/>
        <input type="text" name="list[0].age" value="20"><br/>
        <hr>
        <input type="text" name="list[1].name" value="李四"><br/>
        <input type="text" name="list[1].address" value="湖南"><br/>
        <input type="text" name="list[1].age" value="22"><br/>
        <hr>
        <input type="submit"  value="提交">
    </form>
</body>
</html>