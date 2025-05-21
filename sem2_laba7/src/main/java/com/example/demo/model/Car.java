package com.example.demo.model;

public abstract class Car {

    private String brand;
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

    public Car(String brand, String horsePower, String fuelType, int year, int mileage, String transmission,
               double engineVolume, String generation) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
        this.year = year;
        this.mileage = mileage;
        this.transmission = transmission;
        this.engineVolume = engineVolume;
        this.generation = generation;
    }

    public abstract String getType();


    public String getBrand() {
        return brand;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public String getFuelType() {
        return fuelType;
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

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public String getTransmission() {
        return transmission;
    }

    public double getEngineVolume() {
        return engineVolume;
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
}