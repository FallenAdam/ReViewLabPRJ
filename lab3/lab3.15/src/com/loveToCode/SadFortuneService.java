package com.loveToCode;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Sad Fortune";
    }
}
