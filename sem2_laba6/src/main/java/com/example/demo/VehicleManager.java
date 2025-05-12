package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleManager {
    private final VehicleCategory vehicleCategory;

    @Autowired
    public VehicleManager(@Qualifier("sedan") VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }
}
