package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String classPage(){
        return "index";
    }
    
    
    @RequestMapping("/nora")
    public String nora(){
        return "nora";
    }
}
