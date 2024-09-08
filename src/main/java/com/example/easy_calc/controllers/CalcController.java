package com.example.easy_calc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {

    @GetMapping("/")
    public String showCalculator(){
        return "calculator";
    }
    @PostMapping("/calculate")
    public String calculate(
            @RequestParam("number1") double number1,
            @RequestParam("number2") double number2,
            Model model) {
        double result = number1 + number2;
        model.addAttribute("result", result);
        return "calculator";
    }
}
