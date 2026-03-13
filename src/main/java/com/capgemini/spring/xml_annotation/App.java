package com.capgemini.spring.xml_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        System.out.println();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationConfig.xml");

        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);

        System.out.println();

    }

}
