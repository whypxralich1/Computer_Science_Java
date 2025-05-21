package com.example.demo.service;

import com.example.demo.model.Car;
import org.springframework.stereotype.Service;

@Service
public class VehicleDisplayer {

    private String displayFormat = "full";

    public String getDisplayFormat() {
        return displayFormat;
    }

    public void setDisplayFormat(String displayFormat) {
        this.displayFormat = displayFormat;
    }

    public String display(Car car) {
        StringBuilder sb = new StringBuilder();
        sb.append("Марка: ").append(car.getBrand()).append("<br>");
        sb.append("Модификация: ").append(car.getHorsePower()).append("<br>");
        sb.append("Тип двигателя: ").append(car.getEngineType() != null ? car.getEngineType() : "Не указано").append("<br>");
        sb.append("Пробег: ").append(car.getMileage()).append(" км<br>");
        if ("full".equals(displayFormat)) {
            sb.append("Год выпуска: ").append(car.getYear()).append("<br>");
            sb.append("Поколение: ").append(car.getGeneration()).append("<br>");
            sb.append("Цвет: ").append(car.getColor()).append("<br>");
            sb.append("Объем двигателя: ").append(car.getEngineVolume()).append(" л<br>");
            sb.append("Коробка передач: ").append(car.getTransmission()).append("<br>");
            sb.append("Тип кузова: ").append(car.getType()).append("<br>");
            sb.append("Цена: ").append(car.getPrice()).append(" руб.<br>");
        }
        return sb.toString();
    }
}