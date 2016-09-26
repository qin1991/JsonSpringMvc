package com.demo.po;

import java.util.Date;

/**
 * Created by antong on 16/7/5.
 */
public class CrJobQuestion{
    private Long id;
    private Integer questionType;
    private Long jobId;
    private Integer orderNum;
    private String question;
    private String questionChoice;
    private Long corpId;
    private String answer;
    private Date createDate;
    private Date updateDate;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestionChoice() {
        return questionChoice;
    }

    public void setQuestionChoice(String questionChoice) {
        this.questionChoice = questionChoice;
    }

    public Long getCorpId() {
        return corpId;
    }

    public void setCorpId(Long corpId) {
        this.corpId = corpId;
    }

    @Override
    public String toString() {
        return "CrJobQuestion{" +
                "id=" + id +
                ", questionType=" + questionType +
                ", jobId=" + jobId +
                ", orderNum=" + orderNum +
                ", question='" + question + '\'' +
                ", questionChoice='" + questionChoice + '\'' +
                ", corpId=" + corpId +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
