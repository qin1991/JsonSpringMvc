package com.demo.controler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.demo.po.Form;
import com.demo.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * Created by dajie on 16-7-21.
 */
@Controller
@RequestMapping(value = "/json")
public class JsonController {

    /**
     * 传递单个字符串参数
     * @param request
     * @param userName
     * @return
     */
    @RequestMapping(value = "testJson1.do")
    @ResponseBody
    public String testJson1(HttpServletRequest request,@RequestParam String userName) {
        System.out.println("userName  "+userName);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", "返回结果");
        return jsonObject.toString();
    }


    /**
     * 传递对象
     * @param request
     * @return
     */
    @RequestMapping(value = "testJson2.do")
    @ResponseBody
    public String testJson2(HttpServletRequest request) {
        System.out.println("进入testJson2测试方法");
        String json = request.getParameter("json");
        System.out.println("json:  " + json);

        //字符串转json对象
        JSONObject Object = JSON.parseObject(json);
        User user = JSONObject.toJavaObject(Object, User.class);
        System.out.println("user:  " + user.toString());

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", "返回结果");
        return jsonObject.toString();
    }

    /**
     * 传递对象数组
     * @param request
     * @return
     */
    @RequestMapping(value = "testJson3.do")
    @ResponseBody
    public String testJson3(HttpServletRequest request) {
        System.out.println("进入testJson3测试方法");
        String json = request.getParameter("json");
        System.out.println("json:  " + json);

        //字符串转json对象
        JSONArray array = JSON.parseArray(json);
        if(array!=null && !array.isEmpty()){
            for(int i=0;i<array.size();i++){
                JSONObject obj = array.getJSONObject(i);
                User user = JSONObject.toJavaObject(obj, User.class);
                System.out.println("user:  " + user.toString());
            }
        }

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", "返回结果");
        return jsonObject.toString();
    }

    @RequestMapping(value = "testJson4.do")
    @ResponseBody
    public String testJson4(HttpServletRequest request) {
        String json = request.getParameter("json");
        System.out.println("json:  " + json);
        JSONObject inputObj = JSONObject.parseObject(json);
        String grade = String.valueOf(inputObj.get("grade"));
        System.out.println("grade:  " + grade);
        String userList = String.valueOf(inputObj.get("userList"));
        //字符串转json对象
        JSONArray array = JSON.parseArray(userList);
        if(array!=null && !array.isEmpty()){
            for(int i=0;i<array.size();i++){
                JSONObject obj = array.getJSONObject(i);
                User user = JSONObject.toJavaObject(obj, User.class);
                System.out.println("user:  " + user.toString());
            }
        }

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", "返回结果");
        return jsonObject.toString();
    }

    /**
     * 传递对象数组
     * @param request
     * @return
     */
    @RequestMapping(value = "testJson5.do")
    @ResponseBody
    public String testJson5(HttpServletRequest request) {
        System.out.println("进入testJson5测试方法");
        String json = request.getParameter("json");
        System.out.println("json:  " + json);
        String corpId = request.getParameter("corpId");
        System.out.println("corpId:  " + corpId);

        //字符串转json对象
        JSONArray array = JSON.parseArray(json);
        if(array!=null && !array.isEmpty()){
            for(int i=0;i<array.size();i++){
                JSONObject obj = array.getJSONObject(i);
                User user = JSONObject.toJavaObject(obj, User.class);
                System.out.println("user:  " + user.toString());
            }
        }

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", "返回结果");
        return jsonObject.toString();
    }
}
