package com.example.demo.model;

public abstract class Car {
    private String brand;
    private String model;
    private String horsePower;
    private String fuelType;
    private int year;
    private int mileage;
    private String transmission;
    private double engineVolume;
    private String color;
    private int price;
    private String engineType;
    private String generation;

    public Car() {
    }

    public Car(String brand, String model, String horsePower, String fuelType, int year, int mileage,
               String transmission, double engineVolume, String generation) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
        this.year = year;
        this.mileage = mileage;
        this.transmission = transmission;
        this.engineVolume = engineVolume;
        this.generation = generation;
    }

    // Геттеры и сеттеры для всех полей

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public abstract String getType();
}