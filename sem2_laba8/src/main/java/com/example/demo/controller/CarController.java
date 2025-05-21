package com.example.demo.controller;

import com.example.demo.model.BMW;
import com.example.demo.model.Dodge;
import com.example.demo.service.VehicleDisplayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/cars/{carType}")
    public String showCarDetails(@PathVariable String carType, Model model) {
        if ("bmw".equalsIgnoreCase(carType)) {
            model.addAttribute("car", bmw);
        } else if ("dodge".equalsIgnoreCase(carType)) {
            model.addAttribute("car", dodge);
        } else {
            return "error";
        }
        return "carDetail";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam("num1") double num1,
                            @RequestParam("num2") double num2,
                            @RequestParam("operation") String operation,
                            Model model) {
    double result;
        String operationSymbol;
        switch (operation.toLowerCase()) {
            case "add":
                result = num1 + num2;
                operationSymbol = "+";
                break;
            case "subtract":
                result = num1 - num2;
                operationSymbol = "-";
                break;
            case "multiply":
                result = num1 * num2;
                operationSymbol = "*";
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                    operationSymbol = "/";
                } else {
                    model.addAttribute("error", "Деление на ноль невозможно!");
                    return "calculate";
                }
                break;
            default:
                model.addAttribute("error", "Неизвестная операция!");
                return "calculate";
        }
        model.addAttribute("result", num1 + " " + operationSymbol + " " + num2 + " = " + result);
        return "calculate";
    }
}