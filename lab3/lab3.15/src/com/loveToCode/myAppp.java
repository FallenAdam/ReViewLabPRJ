package com.loveToCode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myAppp {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext context =
               new AnnotationConfigApplicationContext(Config.class);
        Coach theCoach=context.getBean("swimCoach",Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
