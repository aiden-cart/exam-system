package com.exam.mapper;

import com.exam.entity.Question;
import java.util.List;

public interface QuestionMapper {
    List<Question> selectByPaperId(Integer paperId);
    void addUseCount(Integer qid);
    void addWrongCount(Integer qid);
}