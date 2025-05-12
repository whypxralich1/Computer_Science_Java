package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleDisplay {
    private final VehicleCategory vehicleCategory;

    @Autowired
    public VehicleDisplay(VehicleManager vehicleManager) {
        this.vehicleCategory = vehicleManager.getVehicleCategory(); // Получаем выбранный тип
    }

    public void display() {
        vehicleCategory.init(); // Вызываем метод инициализации
        System.out.println("Категория машины: " + vehicleCategory.getName());
    }

    public void cleanup() {
        vehicleCategory.destroy(); // Вызываем метод уничтожения
    }
}
