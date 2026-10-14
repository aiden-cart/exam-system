package com.exam.controller;
import com.exam.entity.User;
import com.exam.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Resource
    private UserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(){
    	return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(User user, Model model, HttpSession session){
        User loginUser = userService.login(user);
        if(loginUser == null){
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
        session.setAttribute("loginUser",loginUser);
        return "redirect:/paper/list";
    }
}