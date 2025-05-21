package com.example.demo.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bmwE30")
@Scope("singleton")
public class BMW extends Car {

    public BMW() {
        super("BMW", "318i 1.8 MT", "Бензин", 1986, 240000, "Механика", 1.8, "E30 (1982—1994)");
        setColor("Серый");
        setPrice(550000);
        setEngineType("M40 4-цилиндровый");
    }

    @Override
    public String getType() {
        return "Седан";
    }

    @PostConstruct
    public void initializeCar() {
        System.out.println("BMW initialized: " + getBrand());
    }

    @PreDestroy
    public void destroyCar() {
        System.out.println("BMW destroyed: " + getBrand());
    }

    public String displayInfo() {
        return String.format("Марка: %s, Модель: %s, Серия: %s, Год: %d, Пробег: %d, Цвет: %s, Цена: %d",
                getBrand(), getModel(), getGeneration(), getYear(), getMileage(), getColor(), getPrice());
    }
}