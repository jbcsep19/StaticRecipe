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

    @RequestMapping("/dwayne")
    public String antipastoSalad() {
        return "antipastosalad";
    }

    @RequestMapping("/surendra")
    public String momo() {
        return "surendra";
    }

    @RequestMapping("/katrina")
    public String gumbo(){ return "katrina";}

    @RequestMapping("johnk")
    public String chickenSoup() { return "chickenSoup"; }

    @RequestMapping("/cheese-bread")
    public String cheeseBread() { return "cheese-bread"; }

    @RequestMapping("/Beza_home")
    public String homePage(){retun "/Beza_home";}
    @RequestMapping("/beza_recipe")
    public String recipe(){return "beza_recipe";}

    //Daniel here - I'm getting a little bit late today, so I'll push cheese-bread above, now at morning from home
    //please delete these comments after you read them :^)
}

