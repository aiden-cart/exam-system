package com.exam.service.impl;
import com.exam.entity.Question;
import com.exam.mapper.QuestionMapper;
import com.exam.service.QuestionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Resource
    private QuestionMapper questionMapper;

    @Override
    public List<Question> getQuestionByPaper(Integer paperId) {
        return questionMapper.selectByPaperId(paperId);
    }

    @Override
    public void addUseCount(Integer qid) {
        questionMapper.addUseCount(qid);
    }

    @Override
    public void addWrongCount(Integer qid) {
        questionMapper.addWrongCount(qid);
    }
}