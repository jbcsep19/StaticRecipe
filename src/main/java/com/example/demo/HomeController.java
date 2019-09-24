package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String classPage(){
        return "index";
    }
    
    @RequestMapping("/greens")
    public String getGreens(){
        return "Greens";
    }

    @RequestMapping("/nora")
    public String nora(){
        return "nora";
    }

    @RequestMapping("/smoothies")
    public String john1(){
        return "smoothies";
    }

    @RequestMapping("/lemon-lite")
    public String john2(){
        return "lemon-lite";
    }

    @RequestMapping("/fruity-delicious")
    public String john3(){
        return "fruity-delicious";
    }

    @RequestMapping("/kathy")
    public String kathy(){
        return "kathy";
    }

    @RequestMapping("/reymofongo")
    public String reyMofongo() {
        return "reymofongo";
    }
}
