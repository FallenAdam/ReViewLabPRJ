package com.loveToCode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myAppp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach=context.getBean("thatCoach",Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}
