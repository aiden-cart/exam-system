package com.exam.entity;

import java.util.Date;

public class ExamRecord {
    private Integer id;
    private Integer userId;
    private Integer paperId;
    private Integer score;
    private Date createTime;
    private ExamPaper paper;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}
    public Integer getUserId() {return userId;}
    public void setUserId(Integer userId) {this.userId = userId;}
    public Integer getPaperId() {return paperId;}
    public void setPaperId(Integer paperId) {this.paperId = paperId;}
    public Integer getScore() {return score;}
    public void setScore(Integer score) {this.score = score;}
    public Date getCreateTime() {return createTime;}
    public void setCreateTime(Date createTime) {this.createTime = createTime;}
    public ExamPaper getPaper() {return paper;}
    public void setPaper(ExamPaper paper) {this.paper = paper;}
}