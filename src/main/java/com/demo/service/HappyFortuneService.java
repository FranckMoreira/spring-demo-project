package com.demo.service;

import com.demo.service.FortuneService;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your luck day!";
    }
}