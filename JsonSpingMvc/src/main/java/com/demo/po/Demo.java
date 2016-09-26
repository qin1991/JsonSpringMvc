package com.demo.po;

import java.util.Date;

/**
 * Created by dajie on 16-4-15.
 */
public class Demo {
    /**
     *学生id 自增
     */
    private Integer stuId;

    /**
     *学生学号 100522227 10届05（计算机）222（班级）27（学号）
     */
    private String stuNumber;

    /**
     * 学生密码
     */
    private String  stuPassword;

    /**
     *学生姓名
     */
    private String stuName;
    /**
     * 学生性别
     */
    private String stuSex;
    /**
     * 学生年龄
     */
    private Integer stuAge;

    /**
     * 学生年龄
     */
    private String stuNote;

    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    public Demo() {
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuNote() {
        return stuNote;
    }

    public void setStuNote(String stuNote) {
        this.stuNote = stuNote;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuNumber='" + stuNumber + '\'' +
                ", stuPassword='" + stuPassword + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAge=" + stuAge +
                ", stuNote='" + stuNote + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
