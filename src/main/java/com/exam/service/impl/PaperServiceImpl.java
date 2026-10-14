package com.exam.service.impl;
import com.exam.entity.ExamPaper;
import com.exam.mapper.PaperMapper;
import com.exam.mapper.QuestionMapper;
import com.exam.service.PaperService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {
    @Resource
    private PaperMapper paperMapper;
    @Resource
    private QuestionMapper questionMapper;

    @Override
    public List<ExamPaper> findAllPaper() {
        return paperMapper.selectAll();
    }

    @Override
    public ExamPaper findPaperById(Integer id) {
        ExamPaper paper = paperMapper.selectById(id);
        paper.setQuestionList(questionMapper.selectByPaperId(id));
        return paper;
    }
}
