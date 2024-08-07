package com.loveToCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
    public class TennisCoach implements Coach{

    private FortuneService fortuneService;
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
    public TennisCoach(){
        System.out.println("inside constructor");
    }
@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside setFortuneService");
        this.fortuneService = fortuneService;
    }
}
