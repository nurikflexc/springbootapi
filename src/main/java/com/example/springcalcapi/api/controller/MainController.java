package com.example.springcalcapi.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/calc")
    public Integer getSolution(@RequestParam Integer a, @RequestParam Integer b) {
        if (a != 0 || b != 0) {
            return a + b;
        }

        return null;
    }
}
