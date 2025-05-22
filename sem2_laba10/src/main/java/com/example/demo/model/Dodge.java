package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Dodge extends Car {

    public Dodge() {
        super("Dodge", "Challenger", "3.6 4WD AT", "Бензин", 2019, 16391, "Автомат", 3.6, "III рестайлинг 2 (2014—2025)");
        setColor("Синий");
        setPrice(4799999);
        setEngineType("V6 3.6L Pentastar");
    }

    @Override
    public String getType() {
        return "Купе";
    }
}
