package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/")
    public String home() {
        return "helloWorld";
    }

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm3")
    public String  processForm(@RequestParam("studentName") String studentName, Model model) {
        studentName=studentName.toUpperCase();
        String result="hello my Friend from v3"+studentName;
        model.addAttribute("message", result);
        model.addAttribute("studentName", studentName);


        return "welcome";
    }
//    @RequestMapping("/processForm3")
//    public ModelAndView processForm2(HttpServletRequest request, Model model) {
//        String studentName = request.getParameter("message");
//        String result="You have successfully processed the request" + studentName;
//        System.out.println(result);
//        result=result.toUpperCase();
//        model.addAttribute("message", result);
//        return new ModelAndView("welcome");
//    }
}
