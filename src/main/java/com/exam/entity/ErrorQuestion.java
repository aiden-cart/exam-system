package com.exam.entity;

public class ErrorQuestion {
    private Integer id;
    private Integer userId;
    private Integer questionId;
    private String userAnswer;
    private Question question;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}
    public Integer getUserId() {return userId;}
    public void setUserId(Integer userId) {this.userId = userId;}
    public Integer getQuestionId() {return questionId;}
    public void setQuestionId(Integer questionId) {this.questionId = questionId;}
    public String getUserAnswer() {return userAnswer;}
    public void setUserAnswer(String userAnswer) {this.userAnswer = userAnswer;}
    public Question getQuestion() {return question;}
    public void setQuestion(Question question) {this.question = question;}
}