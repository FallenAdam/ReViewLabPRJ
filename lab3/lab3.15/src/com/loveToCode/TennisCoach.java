package com.loveToCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

@Component
public class TennisCoach implements Coach {
    @Qualifier("happyFortuneService")
    @Autowired
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice for 1 hour";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TennisCoach() {
        System.out.println("inside constructor");
    }
//
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("inside setFortuneService");
//        this.fortuneService = fortuneService;
//    }


//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("inside doMyStartupStuff");
//    }
//
//    @PreDestroy
//    public void doMyCleanupStuff() {
//        System.out.println("inside doMyCleanupStuff");
//    }
}
