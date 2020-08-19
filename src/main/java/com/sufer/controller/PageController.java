package com.sufer.controller;

import com.sufer.pojo.User;
import com.sufer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author danger
 * @date 2020/6/1 - 14:30
 */
@Controller
public class PageController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping({"/page-login","/"})
    public String login(){
        return "page-login";
    }

    @RequestMapping("/app-profile")
    public String appProfile(){
        return "app-profile";
    }

    @RequestMapping("/new_prescription")
    public String newPrescription(){
        return "new_prescription";
    }

    @RequestMapping("/new_record")
    public String newRecord(){
        return "new_record";
    }

    @RequestMapping("/new_patient")
    public String newPatient(){
        return "new_patient";
    }

    @RequestMapping("/page-info")
    public String pageInfo(){
        return "page-info";
    }

    @RequestMapping("/page-register")
    public String pageRegister(){
        return "page-register";
    }

    @RequestMapping("/page-reset-password")
    public String pageResetPassword(){
        return "page-reset-password";
    }

    @RequestMapping("/search_personalInfo")
    public String searchPersonalInfo(){
        return "search_personalInfo";
    }

    @RequestMapping("/search_prescription")
    public String searchPrescription(){
        return "search_prescription";
    }

    @RequestMapping("/search_record")
    public String searchRecord(){
        return "search_record";
    }

    @RequestMapping("/search_medicine")
    public String searchMedicine(){
        return "search_medicine";
    }
}
