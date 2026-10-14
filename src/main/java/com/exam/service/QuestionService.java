package com.exam.service;
import com.exam.entity.Question;
import java.util.List;
public interface QuestionService {
    List<Question> getQuestionByPaper(Integer paperId);
    void addUseCount(Integer qid);
    void addWrongCount(Integer qid);
}