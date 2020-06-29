package com.demo.service;

public class ForceFortuneService implements FortuneService {
    
    String[] fortunes = new String[]{
        "Today is a day to make great decisions",
        "Kills a lion per day",
        "All enforces leads you to a great destiny"
    };

    public String getFortune() {
        return randomFortune();
    }

    private String randomFortune() {
        int index = (int) Math.floor((Math.random() * ((fortunes.length - 1) + 1)) + 1) - 1;
        return fortunes[index];
    }
}