package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String home() {
        return "helloWorld";
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
    @RequestMapping("/processForm2")
    public ModelAndView processForm2(HttpServletRequest request, Model model) {
        String studentName = request.getParameter("message");
        String result="You have successfully processed the request" + studentName;
        System.out.println(result);
        result=result.toUpperCase();
        model.addAttribute("message", result);
        return new ModelAndView("welcome");
    }
}
