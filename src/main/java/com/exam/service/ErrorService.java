package com.exam.service;
import com.exam.entity.ErrorQuestion;
import java.util.List;
public interface ErrorService {
    void saveError(ErrorQuestion eq);
    List<ErrorQuestion> getUserError(Integer userId);
}