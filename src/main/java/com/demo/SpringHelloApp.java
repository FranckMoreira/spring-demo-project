package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.component.Coach;

public class SpringHelloApp {
    
    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}