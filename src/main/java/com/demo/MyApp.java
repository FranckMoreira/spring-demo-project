package com.demo;

import com.demo.component.Coach;
import com.demo.component.TrackCoach;

public class MyApp {
    public static void main(String[] args) {
        Coach theCoach = new TrackCoach();

        System.out.println(theCoach.getDailyWorkout());
    }
}