package com.demo.controler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

/**
 * Created by dajie on 16-7-25.
 */
public class test {
    public static void main(String[] args) {
        JSONArray jsonArray = JSON.parseArray("[{\"corpId\":\"9100102800000000001\", \"jobId\":\"2000100100000000051\", \"wishId\":\"9200100800000074457\", \"qId\":\"1\", \"answer\":\"北京\" }]");
        System.out.print(jsonArray);
    }
}
