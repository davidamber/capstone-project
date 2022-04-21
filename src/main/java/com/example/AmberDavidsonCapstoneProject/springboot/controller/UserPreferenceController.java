package com.example.AmberDavidsonCapstoneProject.springboot.controller;

import com.example.AmberDavidsonCapstoneProject.springboot.model.Ratio;
import com.example.AmberDavidsonCapstoneProject.springboot.model.UserPreference;
import com.example.AmberDavidsonCapstoneProject.springboot.service.UserPreferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserPreferenceController {
    @Autowired
    private UserPreferenceService userPreferenceService;
    @GetMapping("/form")
    public String form(Model model) {
        UserPreference userPreference = userPreferenceService.getUserPreferenceById(1);
        model.addAttribute("userId", userPreference.getBrewMethodId());
        model.addAttribute("userPreference",new UserPreference());
        return "form";
    }

    @PostMapping("/form/{id}")
    public String test(@PathVariable long id, @ModelAttribute UserPreference userPreference, Model model) {
        System.out.println(userPreference);

        double water = userPreference.getCups()*236.5;
        double coffee = water/17.0;

        model.addAttribute("methodName", userPreference.getBrewMethodName());
        model.addAttribute("coffee", coffee);
        model.addAttribute("water", water);
        return "brew_results";
    }
}
