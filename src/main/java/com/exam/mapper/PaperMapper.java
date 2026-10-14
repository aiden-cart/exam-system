package com.exam.mapper;

import com.exam.entity.ExamPaper;
import java.util.List;

public interface PaperMapper {
    List<ExamPaper> selectAll();
    ExamPaper selectById(Integer id);
}