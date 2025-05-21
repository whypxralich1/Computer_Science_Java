package com.example.demo.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dodgeChallenger")
@Scope("singleton")
public class Dodge extends Car {

    public Dodge() {
        super("Dodge Challenger", "3.6 4WD AT", "Бензин", 2019, 16391, "Автомат", 3.6, "III рестайлинг 2 (2014—2025)");
        setColor("Синий");
        setPrice(4799999);
        setEngineType("V6 3.6L Pentastar");
    }

    @Override
    public String getType() {
        return "Купе";
    }

    @PostConstruct
    public void initializeCar() {
        System.out.println("Dodge initialized: " + getBrand());
    }

    @PreDestroy
    public void destroyCar() {
        System.out.println("Dodge destroyed: " + getBrand());
    }
}