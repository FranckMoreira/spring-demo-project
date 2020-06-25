package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.component.Coach;

public class SetterDemoApp {
    
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from psring container
        Coach theCoach = context.getBean("cricketCoach", Coach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}