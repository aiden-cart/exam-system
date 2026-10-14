package com.exam.service.impl;
import com.exam.entity.ErrorQuestion;
import com.exam.mapper.ErrorMapper;
import com.exam.service.ErrorService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class ErrorServiceImpl implements ErrorService {
    @Resource
    private ErrorMapper errorMapper;

    @Override
    public void saveError(ErrorQuestion eq) {
        errorMapper.insert(eq);
    }

    @Override
    public List<ErrorQuestion> getUserError(Integer userId) {
        return errorMapper.selectByUserId(userId);
    }
}