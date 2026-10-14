package com.exam.entity;

import java.util.Date;
import java.util.List;

public class ExamPaper {
    private Integer id;
    private String paperName;
    private Integer limitTime;
    private Date createTime;
    private List<Question> questionList;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}
    public String getPaperName() {return paperName;}
    public void setPaperName(String paperName) {this.paperName = paperName;}
    public Integer getLimitTime() {return limitTime;}
    public void setLimitTime(Integer limitTime) {this.limitTime = limitTime;}
    public Date getCreateTime() {return createTime;}
    public void setCreateTime(Date createTime) {this.createTime = createTime;}
    public List<Question> getQuestionList() {return questionList;}
    public void setQuestionList(List<Question> questionList) {this.questionList = questionList;}
}