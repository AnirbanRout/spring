package com.capgemini.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.spring.entity.Employee;
import com.capgemini.spring.entity.PojoClass;
import com.capgemini.spring.entity.User;

public class App {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = applicationContext.getBean("empbean2", Employee.class);
        System.out.println(employee);

        System.out.println();

        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

        System.out.println();

        PojoClass pojoClass = applicationContext.getBean("empbean4", PojoClass.class);
        System.out.println(pojoClass);

        System.out.println();

    }

}
