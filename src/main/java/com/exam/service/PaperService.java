package com.exam.service;
import com.exam.entity.ExamPaper;
import java.util.List;
public interface PaperService {
    List<ExamPaper> findAllPaper();
    ExamPaper findPaperById(Integer id);
}