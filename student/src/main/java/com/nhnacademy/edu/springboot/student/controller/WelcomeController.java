package com.nhnacademy.edu.springboot.student.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("message", "Hello, World!");
        return "welcome";
    }
}
