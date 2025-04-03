package com.example.demo;

public class Coupe implements VehicleCategory {
    private String name;

    public Coupe() {
        this.name = "Купе";
    }

    public String getName() {
        return name;
    }
    public void init() {
        System.out.println("Иницаиализация: " + name);
    }
    public void destroy() {
        System.out.println("Уничтожение: " + name);
    }
}