package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Page1(Model model){
        model.addAttribute("Var1","This is it");
        model.addAttribute("Var2","Greetings everyone");
        return "homeTemplate";
    }


}
