package com.loveToCode;

import org.springframework.stereotype.Component;

@Component("thatCoach")
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice for 1hours";
    }
}
