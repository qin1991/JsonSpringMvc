package com.demo.controler;

import com.alibaba.fastjson.JSONObject;
import com.demo.po.Form;
import com.demo.po.User;
import com.demo.util.RequestUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dajie on 16-7-21.
 */
@Controller
@RequestMapping(value = "/form")
public class FormController {

    private ArrayList<User> users;

    @RequestMapping(value = "batch.do", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONObject batch(HttpServletRequest request,Form users) {
        System.out.println("进入batch测试方法");
        System.out.println("users  "+users.getUsers());

        JSONObject obj = new JSONObject();
        obj.put("data", "返回结果");
        return obj;
    }


    @RequestMapping(value = "batch2.do", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONObject batch2(HttpServletRequest request, User  list) {
        System.out.println("进入batch测试方法");
        System.out.println("list  "+list);

        JSONObject obj = new JSONObject();
        obj.put("data", "返回结果");
        return obj;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
