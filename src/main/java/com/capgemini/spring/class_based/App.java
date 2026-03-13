package com.capgemini.spring.class_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        System.out.println();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        Bike bike = applicationContext.getBean(Bike.class);
        System.out.println(bike);

        System.out.println();

    }

}
