package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.component.CricketCoach;

public class SetterDemoApp {
    
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from psring container
        CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getTeam());

        System.out.println(theCoach.getEmailAddress());

        //close the context
        context.close();
    }
}