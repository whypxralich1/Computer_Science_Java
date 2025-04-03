package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Coupe implements VehicleCategory {
    private String name;

    public Coupe() {
        this.name = "Купе";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void init() {
        System.out.println("Инициализация: " + name);
    }

    @Override
    public void destroy() {
        System.out.println("Уничтожение: " + name);
    }
}