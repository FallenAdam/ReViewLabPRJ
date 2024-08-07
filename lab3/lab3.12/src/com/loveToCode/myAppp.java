package com.loveToCode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myAppp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("ConfigFile.class");
        Coach theCoach=context.getBean("tennisCoach",Coach.class);
        Coach myCoach=context.getBean("tennisCoach",Coach.class);
        boolean flag=(theCoach==myCoach);
        System.out.println("Memory locaction in theCoach: "+theCoach);
        System.out.println("Memory locaction in MyCoach: "+myCoach);
        System.out.println(flag);
//        System.out.println(theCoach.getDailyWorkout());
//        System.out.println(theCoach.getDailyFortune());
//        context.close();
    }
}
