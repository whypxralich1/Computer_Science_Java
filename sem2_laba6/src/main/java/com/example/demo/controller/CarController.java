package com.example.demo.controller;

import com.example.demo.model.BMW;
import com.example.demo.model.Dodge;
import com.example.demo.service.VehicleDisplayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    private final BMW bmw;
    private final Dodge dodge;
    private final VehicleDisplayer displayer;

    @Autowired
    public CarController(BMW bmw, Dodge dodge, VehicleDisplayer displayer) {
        this.bmw = bmw;
        this.dodge = dodge;
        this.displayer = displayer;
    }

    @GetMapping("/cars")
    public String showCars(Model model) {
        String bmwDisplay = displayer.display(bmw);
        String dodgeDisplay = displayer.display(dodge);

        model.addAttribute("bmwInfo", bmwDisplay);
        model.addAttribute("dodgeInfo", dodgeDisplay);
        return "cars";
    }
}