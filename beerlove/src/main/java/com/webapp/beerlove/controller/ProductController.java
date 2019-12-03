package com.webapp.beerlove.controller;

 import org.springframework.beans.factory.annotation.Value;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    //@Value("${spring.application.name}")
    //String appName;

    @RequestMapping("/home")
    public String loginMessage() {
        return "welcome";
//    }    public String homePage(Model model) {
//        //model.addAttribute("appName", appName);
//        return "welcome";
//    }
    }
}
