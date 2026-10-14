package com.exam.controller;
import com.exam.entity.ErrorQuestion;
import com.exam.entity.ExamRecord;
import com.exam.entity.User;
import com.exam.service.ErrorService;
import com.exam.service.RecordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/record")
public class RecordController {
    @Resource
    private RecordService recordService;
    @Resource
    private ErrorService errorService;

    @RequestMapping("/list")
    public String recordList(Model model, HttpSession session){
        User user = (User)session.getAttribute("loginUser");
        if(user == null) return "redirect:/login/toLogin";
        List<ExamRecord> recordList = recordService.getRecordByUser(user.getId());
        List<ErrorQuestion> errorList = errorService.getUserError(user.getId());
        model.addAttribute("recordList",recordList);
        model.addAttribute("errorList",errorList);
        return "record";
    }
}