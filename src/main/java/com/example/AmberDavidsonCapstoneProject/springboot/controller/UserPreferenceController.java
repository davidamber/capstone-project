package com.example.AmberDavidsonCapstoneProject.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class UserPreferenceController {
    @GetMapping("/form")
    public String form() {
        return "form";
    }
}
