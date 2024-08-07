package com.loveToCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
    @Qualifier("sadFortuneService")
    @Autowired
    private FortuneService fortuneService;
    public SwimCoach(@Qualifier("sadFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;

    }

    @Override
    public String getDailyWorkout() {
        return "Swim Coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
