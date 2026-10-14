package com.exam.controller;
import com.exam.entity.ExamPaper;
import com.exam.entity.User;
import com.exam.service.PaperService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/paper")
public class PaperController {
    @Resource
    private PaperService paperService;

    // 展示所有试卷（试题文件名）
    @RequestMapping("/list")
    public String paperList(Model model, HttpSession session){
        User user = (User)session.getAttribute("loginUser");
        if(user == null) return "redirect:/login/toLogin";
        List<ExamPaper> paperList = paperService.findAllPaper();
        model.addAttribute("paperList",paperList);
        return "index";
    }

    // 进入考试页面
    @RequestMapping("/toExam")
    public String toExam(Integer paperId, Model model, HttpSession session){
        User user = (User)session.getAttribute("loginUser");
        if(user == null) return "redirect:/login/toLogin";
        ExamPaper paper = paperService.findPaperById(paperId);
        model.addAttribute("paper",paper);
        return "exam";
    }
}