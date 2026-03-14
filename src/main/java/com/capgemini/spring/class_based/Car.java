package com.capgemini.spring.class_based;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Value("12")
    private int id;

    @Value("Audi")
    private String name;

    @Value("aqua")
    private String color;

    @Override
    public String toString() {
        return "Car [id=" + id + ", name=" + name + ", color=" + color + "]";
    }
}