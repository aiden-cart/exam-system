package com.exam.mapper;

import com.exam.entity.ExamRecord;
import java.util.List;

public interface RecordMapper {
    void insert(ExamRecord record);
    List<ExamRecord> selectByUserId(Integer userId);
}