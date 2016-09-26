package com.demo.controler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.demo.po.CrWishJobAnswer;
import com.demo.po.Demo;
import com.demo.po.User;
import com.demo.util.RequestUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dajie on 16-7-4.
 */
@Controller
@RequestMapping(value = "/demo")
public class LoginController {


    @RequestMapping(value = "/login.do")
    public String login(HttpServletRequest request, String stuNumber, String stuPassword) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("stuNumber", stuNumber);
        map.put("stuPassword", stuPassword);
        request.getSession().setAttribute("stuNumber", stuNumber);
        return "index";
    }

    @RequestMapping(value = "testJson1.do", method = {RequestMethod.POST})
    @ResponseBody
    public JSONObject testJson1(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        System.out.println("进入testJson1测试方法");
        obj.put("data", "返回结果");
        return obj;
    }

    @RequestMapping(value = "testJson2.do", method = {RequestMethod.POST})
    @ResponseBody
    public void testJson2(@RequestBody List<Demo> list) {
        System.out.println("进入测试方法");
        System.out.println("list " + list.size());
    }

    @RequestMapping(value = "testJson3.do", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONObject testJson3(HttpServletRequest request) {
        JSONObject requestJson = RequestUtil.getRequestJson(request);
        String pageNo = requestJson.getString("pageNo");
        String pageSize = requestJson.getString("pageSize");

        System.out.println("pageNo " + pageNo);
        System.out.println("pageSize " + pageSize);

        JSONObject obj = new JSONObject();
        System.out.println("进入testJson1测试方法");
        obj.put("data", "返回结果");
        return obj;
    }

    /**
     * 返回单个Object
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "testJson4.do", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONObject testJson4(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        String pageNo = request.getParameter("pageNo");
        System.out.println("pageNo  " + pageNo);
//        String json = request.getParameter("json");
//        Object o = JSON.parseObject(json, Object.class);
        Demo demo = new Demo();
        demo.setStuId(1);
        demo.setStuName("张三");
        demo.setStuNumber("100");
        demo.setStuAge(22);
        JSONObject jsonObject = (JSONObject) JSON.toJSON(demo);
        return jsonObject;
    }


    /**
     * 测试form1，form提交
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "testJson5.do", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONObject testJson5(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        String corpId = request.getParameter("corpId");
        System.out.println("corpId  " + corpId);
//        String json = request.getParameter("json");
//        Object o = JSON.parseObject(json, Object.class);
        Demo demo = new Demo();
        demo.setStuId(1);
        demo.setStuName("张三");
        demo.setStuNumber("100");
        demo.setStuAge(22);
        JSONObject jsonObject = (JSONObject) JSON.toJSON(demo);
        return jsonObject;
    }


    /**
     * 数组对象
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "testJson6.do", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONObject testJson6(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        String data = request.getParameter("data");
        System.out.println("data  " + data);

        JSONObject requestJson = RequestUtil.getRequestJson(request);
        //"id":1,"name":"张三",age:30
        requestJson.getString("id");
        requestJson.getString("name");

        return obj;
    }

    /**
     * 数组对象
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "testJson7.do", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONObject testJson7(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        String data = request.getParameter("data");
        System.out.println("data  " + data);
//        String json = request.getParameter("json");
//        Object o = JSON.parseObject(json, Object.class);


        JSONObject requestJson = RequestUtil.getRequestJson(request);
        String myData = requestJson.getString("data");
        requestJson.toJSONString();
        JSONArray array = JSONArray.parseArray(myData);
        array.isEmpty();
        return obj;
    }

    /**
     * 数组对象
     *
     * @param request
     * @return
     */
//    @RequestMapping(value = "testJson9.do", produces = "application/json;charset=UTF-8")
    @RequestMapping(value = "testJson9.do")
    @ResponseBody
    public JSONObject testJson9(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        String json = request.getParameter("json");
        System.out.println("json  " + json);

        JSONObject requestJson = RequestUtil.getRequestJson(request);
        if (requestJson != null) {
            String myData = requestJson.getString("json");
            JSONArray array = JSONArray.parseArray(myData);
            requestJson.toJSONString();
            array.isEmpty();
        }
        return obj;
    }


    /**
     * 数组对象
     *
     * @param request
     * @return
     */
//    @RequestMapping(value = "testJson9.do", produces = "application/json;charset=UTF-8")
    @RequestMapping(value = "testJson10.do")
    @ResponseBody
    public JSONObject testJson10(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        String json = request.getParameter("address");
        System.out.println("json  " + json);
        JSONArray array = JSONArray.parseArray(json);
        array.isEmpty();
        JSONObject requestJson = RequestUtil.getRequestJson(request);

        return obj;
    }


    /**
     * 数组对象
     *
     * @param request
     * @return
     */
//    @RequestMapping(value = "testJson9.do", produces = "application/json;charset=UTF-8")
    @RequestMapping(value = "testJson11.do")
    @ResponseBody
    public JSONObject testJson11(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        String json = request.getParameter("json");
        System.out.println("json  " + json);
        JSONArray array = JSONArray.parseArray(json);
        array.isEmpty();
        for (int i = 0; i < array.size(); i++) {
            JSONObject jsonObjects = array.getJSONObject(i);
            User user = JSONObject.toJavaObject(jsonObjects, User.class);
            System.out.println("user  " + user);
        }
        JSONObject requestJson = RequestUtil.getRequestJson(request);
        return obj;
    }

    /**
     * 传递单个字符串参数
     * @param request
     * @return
     */
    @RequestMapping(value = "testJson12.do")
    @ResponseBody
    public String testJson12(HttpServletRequest request,@RequestParam(value ="uid",required = false)
    long uid,@RequestParam(value ="score",required = false) String score,@RequestParam(value ="url",required = false) String url) {
        JSONObject obj = new JSONObject();
        System.out.println("uid  " + uid);
        System.out.println("score  " + score);
        System.out.println("url  " + url);
        obj.put("uid", uid);
        obj.put("score", score);
        obj.put("url", url);
        return obj.toJSONString();
    }


    /**
     * 数组对象
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "testJsonArray.do")
    @ResponseBody
    public JSONObject testJsonArray(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        String json = request.getParameter("json");
        System.out.println("json  " + json);
        JSONArray array = JSONArray.parseArray(json);
        array.isEmpty();
        for (int i = 0; i < array.size(); i++) {
            JSONObject jsonObjects = array.getJSONObject(i);
            CrWishJobAnswer answer = JSONObject.toJavaObject(jsonObjects, CrWishJobAnswer.class);
            System.out.println("answer  " + answer);
        }
        return obj;
    }

    /**
     * 数组对象
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "testJsonArray2.do")
    @ResponseBody
    public JSONObject testJsonArray2(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        String json = request.getParameter("json");
        System.out.println("json  " + json);
        JSONArray array = JSONArray.parseArray(json);
        if (array != null && array.size() != 0) {
            for (int i = 0; i < array.size(); i++) {
                JSONObject jsonObjects = array.getJSONObject(i);
                CrWishJobAnswer answer = JSONObject.toJavaObject(jsonObjects, CrWishJobAnswer.class);
                System.out.println("answer  " + answer);
            }
        }
        return obj;
    }


    /**
     * 数组对象
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "testJsonArray3.do")
    @ResponseBody
    public JSONObject testJsonArray3(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        Map<Long, List<CrWishJobAnswer>> map = getMap(request);
        return obj;
    }


    /**
     * 数组对象
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "testJsonArray4.do")
    @ResponseBody
    public JSONObject testJsonArray4(HttpServletRequest request, @RequestParam(value = "userName") String userName) {
        JSONObject obj = new JSONObject();
        System.out.println("userName  " + userName);
        obj.put("data", userName);
        return obj;
    }


    /**
     * 获取前台传递过来的参数，并转换 Map<Long, List<CrWishJobAnswer>>格式
     *
     * @param request
     */
    public Map<Long, List<CrWishJobAnswer>> getMap(HttpServletRequest request) {
        Map<Long, List<CrWishJobAnswer>> map = new HashMap<Long, List<CrWishJobAnswer>>();
        String json = request.getParameter("json");
        JSONArray array = JSONArray.parseArray(json);
        if (array != null && array.size() != 0) {
            for (int i = 0; i < array.size(); i++) {
                JSONObject jsonObjects = array.getJSONObject(i);
                CrWishJobAnswer answer = JSONObject.toJavaObject(jsonObjects, CrWishJobAnswer.class);
                if (map.get(answer.getWishId()) != null && !map.get(answer.getWishId()).isEmpty()) {
                    List<CrWishJobAnswer> list2 = map.get(answer.getWishId());
                    list2.add(answer);
                    map.put(answer.getWishId(), list2);
                } else {
                    List<CrWishJobAnswer> list2 = new ArrayList<CrWishJobAnswer>();
                    list2.add(answer);
                    map.put(answer.getWishId(), list2);
                }
            }
        }
        map.isEmpty();
        return null;
    }


    /**
     * form表单，按钮提交
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "testForm.do", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONObject testForm(HttpServletRequest request) {
        String corpId = request.getParameter("corpId");
        System.out.println("corpId  " + corpId);
        String location = request.getParameter("location");
        System.out.println("location  " + location);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", "成功了");
        return jsonObject;
    }
}