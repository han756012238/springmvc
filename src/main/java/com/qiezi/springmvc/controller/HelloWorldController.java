package com.qiezi.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: qiezi
 * Date: 2016/4/7
 * Time: 17:02
 */
@Controller
@RequestMapping("/mvc")
public class HelloWorldController {

    @RequestMapping("/hello1")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping("/hello2")
    public String helloWorld(Model model){
        model.addAttribute("message", "Hello World!");
        return "hello";
    }


    @RequestMapping("/person")
    public String toPerson(String name,double age){
        System.out.println(name+" "+age);
        return "hello";
    }
}
