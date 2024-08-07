package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String home() {
        return "helloworld-form";
    }

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public ModelAndView processForm(@RequestParam("studentName") String studentName) {
        System.out.println("Student Name: " + studentName); // Logging
        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("studentName", studentName);
        return modelAndView;
    }
}
