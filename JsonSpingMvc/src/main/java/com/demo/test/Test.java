package com.demo.test;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dajie on 16-7-22.
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println(get());

        String str = "120334";

        System.out.println(str.substring(0,2));



    }

    public static String  get() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("corpId", "1");
        jsonObject.put("jobId", "10");
        jsonObject.put("wishId", "100");
        jsonObject.put("jobName", "java开发");
        jsonObject.put("hasQuestion", false);//是否有职位问题
        List<JSONObject> jsonObjectList = new ArrayList<JSONObject>();
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("qId", "q1");
        jsonObject1.put("question", "面试地点");
        jsonObject1.put("questionChoice", "北京,上海,天津");//北京,上海,天津
        jsonObjectList.add(jsonObject1);
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("qId", "q2");
        jsonObject2.put("question", "到岗时间");
        jsonObject2.put("questionChoice", "1,2,3");//北京,上海,天津
        jsonObjectList.add(jsonObject2);

        jsonObject.put("questionList", jsonObjectList);

        return jsonObject.toJSONString();
    }

}
