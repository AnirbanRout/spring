package com.capgemini.spring.class_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PojoClass {

    @Autowired
    private Bike bike;

    @Autowired
    private Car car;

    @Override
    public String toString() {
        return "PojoClass [bike=" + bike + ", car=" + car + "]";
    }
}