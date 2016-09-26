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
        function testJson() {
            $.ajax({
                type: "POST",     //提交方式
                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/demo/testJson1.do",    //提交的页面，方法名
                data: "parameter",    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    alert(data);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                },
                error: function (err) { //如果执行不成功，那么执行此方法
                    alert("err:" + err);
                }
            });
        }

        function testJson2() {
            var saveDataAry = [];
            var data1 = {"stuNumber": "11", "stuName": "zhangsan", "stuNote": "好人"};
            var data2 = {"stuNumber": "22", "stuName": "lisi", "stuNote": "坏人"};
            saveDataAry.push(data1);
            saveDataAry.push(data2);
            $.ajax({
                type: "POST",
                url: "/demo/testJson2.do",
                dataType: "json",
                contentType: "application/json",
                data: saveDataAry,
//                data: JSON.stringify(saveDataAry),
                success: function (data) {
                    alert("成功了。。。。。。。。。");
                }
            });
        }
        function testJson3() {
            var datas = {
                "pageNo": "1",
                "pageSize": "50"
            }
            $.ajax({
                type: "POST",     //提交方式
                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/demo/testJson3.do",    //提交的页面，方法名
                data: JSON.stringify(datas),    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data)
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                },
                error: function (err) { //如果执行不成功，那么执行此方法
                    alert("err:" + err);
                }
            });
        }

        function testJson4() {
            var datas = {
                "pageNo": "1",
                "pageSize": "50"
            }
            $.ajax({
                type: "POST",     //提交方式
                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/demo/testJson4.do",    //提交的页面，方法名
                data: JSON.stringify(datas),    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data)
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                },
                error: function (err) { //如果执行不成功，那么执行此方法
                    alert("err:" + err);
                }
            });
        }

        function testJson6() {
            var myData = {"id": 1, "name": "张三", age: 30};
//            var myData = [ {"id":1,"name":"张三",age:30},{"id":2,"name":"赵四",age:31}]
            $.ajax({
                type: "POST",     //提交方式
                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/demo/testJson6.do",    //提交的页面，方法名
                data: JSON.stringify(myData),    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data)
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                },
                error: function (err) { //如果执行不成功，那么执行此方法
                    alert("err:" + err);
                }
            });
        }


        function testJson7() {
            var myData = {
                "data": [{"address": "北京", "name": "张三", "age": 30}, {
                    "address": "shanghai",
                    "name": "赵四",
                    "age": 31
                }]
            };
            $.ajax({
                type: "POST",     //提交方式
                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/demo/testJson7.do",    //提交的页面，方法名
                data: JSON.stringify(myData),    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data)
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                },
                error: function (err) { //如果执行不成功，那么执行此方法
                    alert("err:" + err);
                }
            });
        }

        function testJson8() {
            var myData = {
                "data": [{"address": "北京", "name": "张三", "age": 30}, {
                    "address": "shanghai",
                    "name": "赵四",
                    "age": 31
                }]
            };
            $.ajax({
                type: "POST",     //提交方式
                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/demo/testJson7.do",    //提交的页面，方法名
                data: JSON.stringify(myData),    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data);
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                }
            });
        }

        //传递字符串，可以
        function testJson9() {
            $.ajax({
                type: "POST",     //提交方式
//                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/demo/testJson9.do",    //提交的页面，方法名
                data: {
                    "json": "aaaaa"
                },    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data);
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                }
            });
        }

        //传递字符串，可以
        function testJson10() {
            $.ajax({
                type: "POST",     //提交方式
//                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/demo/testJson10.do",    //提交的页面，方法名
                data: {
                    "address": "北京", "name": "张三", "age": 30
                },    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data);
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                }
            });
        }

        //传递字符串，可以
        function testJson11() {
            var json = [{
                "address": "北京", "name": "张三", "age": 30
            }, {
                "address": "北京", "name": "张三", "age": 30
            }]
            $.ajax({
                type: "POST",     //提交方式
//                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/demo/testJson11.do",    //提交的页面，方法名
                data: {
                    "json":JSON.stringify(json)
                },    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data);
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                }
            });
        }


        //传递字符串
        function testJson12() {
            $.ajax({
                type: "POST",     //提交方式
                dataType: "json",     //类型
                url: "/demo/testJson12.do",    //提交的页面，方法名
                data: {
                    "uid": "1",
                    "score": "90.50",
                    "url": "www.baidu.com"
                },    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data);
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                }
            });
        }

    </script>

</head>
<body>
<h2>测试样例</h2>
<input type="button" value="json传参" onclick="testJson()"></button><br/>
<input type="button" value="json传参2" onclick="testJson2()"></button><br/>
<input type="button" value="json传参3" onclick="testJson3()"></button><br/>
<input type="button" value="json传参4" onclick="testJson4()"></button><br/>
<input type="button" value="json传递对象" onclick="testJson6()"></button><br/>
<input type="button" value="json传递数组对象" onclick="testJson7()"></button><br/>
<input type="button" value="json传递数组对象2" onclick="testJson8()"></button><br/>
<input type="button" value="getParameter字符串1-ok" onclick="testJson9()"></button><br/>
<input type="button" value="getParameter字符串2-ok" onclick="testJson10()"></button><br/>
<input type="button" value="getParameter字符串2-ok" onclick="testJson11()"></button><br/>


<input type="button" value="普通传参" onclick="testJson12()"></button><br/>
</body>
</html>