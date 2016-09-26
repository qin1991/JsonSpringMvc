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
        //传递字符串，可以
        function testJsonArray() {
            var json = [{
                "questionId": "1", "answer": "北京", "wishId": "10", "corpId": "100", "jobId": "1000"
            }, {
                "questionId": "2", "answer": "海南", "wishId": "20", "corpId": "200", "jobId": "2000"
            }]
            $.ajax({
                type: "POST",     //提交方式
//                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/demo/testJsonArray.do",    //提交的页面，方法名
                data: {
                    "json": JSON.stringify(json)
                },    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data);
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                }
            });
        }


        //传递字符串，可以
        function testJsonArray2() {
            var json2 = [{
                "questionId": "1", "answer": "北京", "wishId": "10", "corpId": "100", "jobId": "1000"
            }, {
                "questionId": "2", "answer": "海南", "wishId": "20", "corpId": "200", "jobId": "2000"
            }];
            $.ajax({
                type: "POST",     //提交方式
//                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/demo/testJsonArray2.do",    //提交的页面，方法名
//                data:  JSON.stringify(json2),    //参数，如果没有，可以为null
                data: {
                    "json": JSON.stringify(json2)
                },    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data);
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                }
            });
        }


        //传递字符串，可以
        function testJsonArray3() {

            var json1 = {
                        "json": [{
                            "questionId": "1", "answer": "北京", "wishId": "10", "corpId": "100", "jobId": "1000"}, {
                            "questionId": "2", "answer": "加班", "wishId": "10", "corpId": "100", "jobId": "1000"}, {
                            "questionId": "2", "answer": "海南", "wishId": "20", "corpId": "200", "jobId": "2000"
                        }]
                    };
            var json2 = [{
                "questionId": "1", "answer": "北京", "wishId": "10", "corpId": "100", "jobId": "1000"
            },
                {
                    "questionId": "2", "answer": "加班", "wishId": "10", "corpId": "100", "jobId": "1000"
                }, {
                    "questionId": "2", "answer": "海南", "wishId": "20", "corpId": "200", "jobId": "2000"
                }];
            $.ajax({
                type: "POST",     //提交方式
                dataType: "json",     //类型
                url: "/demo/testJsonArray3.do",    //提交的页面，方法名
//                data:  JSON.stringify(json1),    //参数，如果没有，可以为null
                data: {
                    "json": JSON.stringify(json2)
                },    //参数，如果没有，可以为null
                success: function (data) { //如果执行成功，那么执行此方法
                    var e = JSON.stringify(data.data);
                    alert(e);        //用data.d来获取后台传过来的json语句，或者是单纯的语句
                }
            });
        }

        //传递字符串，可以
        function testJsonArray4() {
            $.ajax({
                type: "POST",     //提交方式
//                contentType: "application/json; charset=utf-8",   //内容类型
                dataType: "json",     //类型
                url: "/demo/testJsonArray4.do",    //提交的页面，方法名
//                data:  JSON.stringify(json2),    //参数，如果没有，可以为null
                data: {
                    "userName": "111"
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
<input type="button" value="getParameter字符串数组-好使" onclick="testJsonArray()"></button>
<input type="button" value="getParameter字符串数组-不好使" onclick="testJsonArray2()"></button>
<input type="button" value="getParameter字符串数组-不好使" onclick="testJsonArray3()"></button>
<input type="button" value="RequestParam注解" onclick="testJsonArray4()"></button>
</body>
</html>