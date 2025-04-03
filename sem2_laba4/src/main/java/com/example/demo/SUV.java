package com.example.demo;

public class SUV implements VehicleCategory {
    private String name;

    public SUV() {
        this.name = "Внедорожник";
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