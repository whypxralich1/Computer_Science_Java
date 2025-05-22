package com.example.demo.controller;

import com.example.demo.model.BMW;
import com.example.demo.model.Car;
import com.example.demo.model.Dodge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final List<Car> carList = new ArrayList<>();

    @Autowired
    public CarController(BMW bmw, Dodge dodge) {
        carList.add(bmw);
        carList.add(dodge);
    }

    @GetMapping
    public String showCars(Model model) {
        model.addAttribute("cars", carList);
        return "cars";
    }

    @GetMapping("/{index}")
    public String showCarDetails(@PathVariable int index, Model model) {
        if (isIndexValid(index)) {
            model.addAttribute("car", carList.get(index));
            model.addAttribute("index", index);
            return "carDetail";
        }
        return "error";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("car", new BMW());
        model.addAttribute("isNew", true);
        return "carForm";
    }

    @PostMapping("/add")
    public String addCar(@ModelAttribute Car car) {
        carList.add(car);
        return "redirect:/cars";
    }

    @GetMapping("/{index}/edit")
    public String showEditForm(@PathVariable int index, Model model) {
        if (isIndexValid(index)) {
            model.addAttribute("car", carList.get(index));
            model.addAttribute("index", index);
            model.addAttribute("isNew", false);
            return "carForm";
        }
        return "error";
    }

    @PatchMapping("/{index}")
    public String updateCar(@PathVariable int index, @ModelAttribute Car car) {
        if (isIndexValid(index)) {
            carList.set(index, car);
            return "redirect:/cars/" + index;
        }
        return "error";
    }

    @DeleteMapping("/{index}")
    public String deleteCar(@PathVariable int index) {
        if (isIndexValid(index)) {
            carList.remove(index);
            return "redirect:/cars";
        }
        return "error";
    }

    private boolean isIndexValid(int index) {
        return index >= 0 && index < carList.size();
    }
}