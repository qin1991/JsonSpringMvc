package com.demo.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by dajie on 16-7-21.
 */
public class Demo {
    public static void main(String[] args) {
        MyUser user = new MyUser("张三", 22, "好学生");
        //vo 转json字符串
        String json = JSONObject.toJSONString(user);
        System.out.println(json);
        //json 转vo
        MyUser nowVo = JSON.parseObject(json, MyUser.class);
        System.out.println(nowVo);
        //vo 转json对象
        JSONObject jsonObject = JSONObject.parseObject(json);
        System.out.println(jsonObject);
    }
}

class MyUser {
    private String name;
    private int age;
    private String note;

    public MyUser() {

    }

    public MyUser(String name, int age, String note) {
        this.name = name;
        this.age = age;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", note='" + note + '\'' +
                '}';
    }
}



