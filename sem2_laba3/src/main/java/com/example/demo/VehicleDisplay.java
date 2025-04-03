package com.example.demo;

public class VehicleDisplay<T extends VehicleCategory> {
    private T category;

    public VehicleDisplay(T category) {
        this.category = category;
    }
    public void display() {
        System.out.println("Категория машины: " + category.getName());
    }
}
