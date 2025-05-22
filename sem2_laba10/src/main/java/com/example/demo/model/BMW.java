package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class BMW extends Car {

    public BMW() {
        super("BMW", "E30", "318i 1.8 MT", "Бензин", 1986, 240000, "Механика", 1.8, "E30 (1982—1994)");
        setColor("Серый");
        setPrice(550000);
        setEngineType("M40 4-цилиндровый");
    }

    @Override
    public String getType() {
        return "Седан";
    }
}