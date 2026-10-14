package com.exam.service.impl;
import com.exam.entity.ExamRecord;
import com.exam.mapper.RecordMapper;
import com.exam.service.RecordService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Resource
    private RecordMapper recordMapper;

    @Override
    public void saveRecord(ExamRecord record) {
        recordMapper.insert(record);
    }

    @Override
    public List<ExamRecord> getRecordByUser(Integer userId) {
        return recordMapper.selectByUserId(userId);
    }
}