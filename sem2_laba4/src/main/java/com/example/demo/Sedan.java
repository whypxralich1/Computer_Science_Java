package com.example.demo;

public class Sedan implements VehicleCategory {
    private String name;

    public Sedan() {
        this.name = "Седан";
    }

    public String getName() {
        return name;
    }
    public void init() {
        System.out.println("Инициализация: " + name);
    }
    public void destroy() {
        System.out.println("Уничтожение: " + name);
    }
}
