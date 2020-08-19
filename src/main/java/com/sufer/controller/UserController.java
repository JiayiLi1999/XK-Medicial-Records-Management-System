package com.sufer.controller;

import com.sufer.mapper.UserMapper;
import com.sufer.pojo.Doctor;
import com.sufer.pojo.User;
import com.sufer.service.DoctorService;
import com.sufer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author danger
 * @date 2020/6/13
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    DoctorService doctorService;

    @RequestMapping("/login")
    public String pageLogin(@RequestParam("user-email")String userEmail,
                            @RequestParam("password")String password,
                            HttpSession session,
                            Model model){
        User user = userService.selectPasswordByEmail(userEmail, password);
        Doctor doctor = doctorService.selectDoctorByUserId(user.getUserId());
        if ( user != null){
            //登录成功！
            System.out.println(doctor.getDoctorId());

            session.setAttribute("username",user.getUserName());
            //
            session.setAttribute("doctor",doctor);
            //登录成功！防止表单重复提交，我们重定向
            return "redirect:/index";
        }else {
            //登录失败！存放错误信息
            model.addAttribute("msg","用户名或密码错误");
            return "page-login";
        }
    }

    @RequestMapping("/register")
    public String register(@RequestParam("user-email")String userEmail,
                           @RequestParam("user-pwd")String password,
                           @RequestParam("user-name")String userName,
                           HttpSession session,
                           Model model, HttpServletResponse response) throws IOException {
        User user = new User(0,userName,password,userEmail,false);
        int s = userService.addUser(user);
        session.setAttribute("userid",user.getUserId());
        session.setAttribute("registersuccessed","注册成功！请填写个人信息");
        return "redirect:/page-info";
    }

    @RequestMapping("/resetpwd")
    public String resetPwd(@RequestParam("user-email")String userEmail,
                           @RequestParam("user-pwd")String password,
                           @RequestParam("user-pwds")String newPassword,
                           HttpSession session,
                           Model model){
        System.out.println("??????????");
        User user = userService.selectPasswordByEmail(userEmail, password);
        if (user != null){
            userService.updatePassword(userEmail,newPassword);
            session.setAttribute("resetmsg","修改密码成功");
        }
        else {
            session.setAttribute("resetmsg","邮件或原密码不正确");
        }

        return "redirect:/page-reset-password";

    }


}
