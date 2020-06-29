package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.component.Coach;

public class BeanScopeDemoApp {
    
    public static void main(String[] args) {
        
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same
        boolean isSameObject = (theCoach == alphaCoach);

        // print out the results
        System.out.println("\nPointing to the same object? " + isSameObject);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        // close the context
        context.close();

    }
}