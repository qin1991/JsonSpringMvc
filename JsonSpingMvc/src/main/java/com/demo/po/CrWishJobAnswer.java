package com.demo.po;

import java.util.Date;

/**
 * Created by antong on 16/7/5.
 */
public class CrWishJobAnswer{
    private Long id;
    private Long questionId;
    private String answer;
    private Long wishId;
    private Long corpId;
    private Long jobId;
    private CrJobQuestion crJobQuestion;
    private Date createDate;
    private Date updateDate;

    public CrJobQuestion getCrJobQuestion() {
        return crJobQuestion;
    }

    public void setCrJobQuestion(CrJobQuestion crJobQuestion) {
        this.crJobQuestion = crJobQuestion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Long getWishId() {
        return wishId;
    }

    public void setWishId(Long wishId) {
        this.wishId = wishId;
    }

    public Long getCorpId() {
        return corpId;
    }

    public void setCorpId(Long corpId) {
        this.corpId = corpId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
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

    @Override
    public String toString() {
        return "CrWishJobAnswer{" +
                "id=" + id +
                ", questionId=" + questionId +
                ", answer='" + answer + '\'' +
                ", wishId=" + wishId +
                ", corpId=" + corpId +
                ", jobId=" + jobId +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
