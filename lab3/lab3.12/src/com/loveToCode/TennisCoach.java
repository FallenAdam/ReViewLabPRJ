package com.loveToCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
    public class TennisCoach implements Coach{
@Autowired
    private FortuneService fortuneService;

    public TennisCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Practice for 1hours";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
//    public TennisCoach(){
//        System.out.println("inside constructor");
//    }
//@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside setFortuneService");
        this.fortuneService = fortuneService;
    }
}
