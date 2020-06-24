package com.demo.component;

import com.demo.service.FortuneService;

public class SoccerCoach implements Coach {   
    
    private FortuneService fortuneService;

    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public SoccerCoach() {}
    
    @Override
    public String getDailyWorkout() {
        return "Run around the soccer field";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}