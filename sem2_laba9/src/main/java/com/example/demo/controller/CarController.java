package com.example.demo.controller;

import com.example.demo.model.BMW;
import com.example.demo.model.Car;
import com.example.demo.model.Dodge;
import com.example.demo.service.VehicleDisplayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final VehicleDisplayer displayer;

    private final List<Car> carList = new ArrayList<>();

    @Autowired
    public CarController(VehicleDisplayer displayer) {
        this.displayer = displayer;

        carList.add(new BMW());
        carList.add(new Dodge());
    }

    @GetMapping
    public String showCars(Model model) {
        List<String> carsInfo = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            String info = displayer.display(car);
            carsInfo.add(info);
        }
        model.addAttribute("carsInfo", carsInfo);
        model.addAttribute("cars", carList);
        return "cars";
    }

    @GetMapping("/{index}")
    public String showCarDetails(@PathVariable int index, Model model) {
        if (index < 0 || index >= carList.size()) {
            return "error";
        }
        model.addAttribute("car", carList.get(index));
        return "carDetail";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("car", new BMW());
        return "carForm";
    }

    // Обработка отправки формы добавления нового автомобиля
    @PostMapping("/add")
    public String addCar(@ModelAttribute Car car, Model model) {
        carList.add(car);
        return "redirect:/cars";
    }
}