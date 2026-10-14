package com.exam.mapper;

import com.exam.entity.ErrorQuestion;
import java.util.List;

public interface ErrorMapper {
    void insert(ErrorQuestion eq);
    List<ErrorQuestion> selectByUserId(Integer userId);
}