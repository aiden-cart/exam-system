package com.exam.service;
import com.exam.entity.ExamRecord;
import java.util.List;
public interface RecordService {
    void saveRecord(ExamRecord record);
    List<ExamRecord> getRecordByUser(Integer userId);
}