package com.demo.component;

import com.demo.service.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach(){
        System.out.println("CricketCoach: inside no-args constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }


    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }
}