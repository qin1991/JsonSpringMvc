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
        //传递字符串
        function testJson1() {
            $.ajax({
                type: "POST",     //提交方式
                dataType: "json",     //类型
                url: "/json/testJson1.do",    //提交的页面，方法名
                data: {
                    "userName": "张三"
                },    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data);
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                }
            });
        }
        //传递对象
        function testJson2() {
            var myData = {"address": "北京", "name": "张三", "age": 30};
            $.ajax({
                type: "POST",     //提交方式
                dataType: "json",     //类型
                url: "/json/testJson2.do",    //提交的页面，方法名
                data: {
                    "json": JSON.stringify(myData)
                },    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data);
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                }
            });
        }

        //传递对象数组
        function testJson3() {
            var json = [{
                "address": "bj", "name": "jerry", "age": 14
            }, {
                "address": "haiNan", "name": "tom", "age": 22
            }]
            $.ajax({
                type: "POST",     //提交方式
//                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/json/testJson3.do",    //提交的页面，方法名
                data: {
                    "json": JSON.stringify(json)
                },    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data);
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                }
            });
        }


        //传递复杂类型  对象数组
        function testJson4() {
            var json = [{
                "address": "bj", "name": "jerry", "age": 14
            }, {
                "address": "haiNan", "name": "tom", "age": 22
            }];

            var Json = {
                "grade": "一年级",
                "userList": JSON.stringify(json)
            };

            $.ajax({
                type: "POST",     //提交方式
//                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/json/testJson4.do",    //提交的页面，方法名
                data: {
                    "json": JSON.stringify(Json)
                },    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data);
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                }
            });
        }


        //传递对象数组
        function testJson5() {
            var json = [{
                "address": "bj", "name": "jerry", "age": 14
            }, {
                "address": "haiNan", "name": "tom", "age": 22
            }]
            $.ajax({
                type: "POST",     //提交方式
//                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/json/testJson5.do",    //提交的页面，方法名
                data: {
                    "json": JSON.stringify(json),
                    "corpId": "9100102800000000001"
                },    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data);
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                }
            });
        }


    </script>

</head>
<body>
<input type="button" value="传递字符串" onclick="testJson1()"></button>
<input type="button" value="传递对象" onclick="testJson2()"></button>
<input type="button" value="传递对象数组" onclick="testJson3()"></button>
<input type="button" value="传递复杂类型-对象[包含对象数组]" onclick="testJson4()"></button>

<input type="button" value="传递对象数组22" onclick="testJson5()"></button>
</body>
</html>