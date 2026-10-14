package com.exam.controller;
import com.exam.entity.ErrorQuestion;
import com.exam.entity.ExamPaper;
import com.exam.entity.ExamRecord;
import com.exam.entity.Question;
import com.exam.entity.User;
import com.exam.service.ErrorService;
import com.exam.service.PaperService;
import com.exam.service.QuestionService;
import com.exam.service.RecordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/exam")
public class ExamController {
    @Resource
    private PaperService paperService;
    @Resource
    private QuestionService questionService;
    @Resource
    private RecordService recordService;
    @Resource
    private ErrorService errorService;

    // 提交试卷，判分、统计使用次数、难度、保存错题
    @RequestMapping("/submit")
    public String submit(@RequestParam Integer paperId, @RequestParam Map<String,String> userAnswerMap, Model model, HttpSession session){
        User loginUser = (User)session.getAttribute("loginUser");
        if(loginUser == null) return "redirect:/login/toLogin";
        ExamPaper paper = paperService.findPaperById(paperId);
        List<Question> qList = paper.getQuestionList();
        int score = 0;
        // 遍历所有题目
        for(Question q : qList){
            // 试题使用次数+1
            questionService.addUseCount(q.getId());
            String userAns = userAnswerMap.get("q"+q.getId());
            if(userAns == null) userAns = "";
            if(q.getAnswer().equals(userAns)){
                score+=50; // 每题50分，总分100
            }else{
                // 答错次数+1，保存错题
                questionService.addWrongCount(q.getId());
                ErrorQuestion eq = new ErrorQuestion();
                eq.setUserId(loginUser.getId());
                eq.setQuestionId(q.getId());
                eq.setUserAnswer(userAns);
                errorService.saveError(eq);
            }
        }
        // 保存考试记录
        ExamRecord record = new ExamRecord();
        record.setUserId(loginUser.getId());
        record.setPaperId(paperId);
        record.setScore(score);
        recordService.saveRecord(record);
        // 回显数据到结果页
        model.addAttribute("paper",paper);
        model.addAttribute("score",score);
        return "result";
    }
 
}