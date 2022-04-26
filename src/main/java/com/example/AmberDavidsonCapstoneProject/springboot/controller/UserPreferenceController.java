package com.example.AmberDavidsonCapstoneProject.springboot.controller;

import com.example.AmberDavidsonCapstoneProject.springboot.model.BrewResults;
import com.example.AmberDavidsonCapstoneProject.springboot.model.Ratio;
import com.example.AmberDavidsonCapstoneProject.springboot.model.UserPreference;
import com.example.AmberDavidsonCapstoneProject.springboot.service.RatioService;
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

    private UserPreferenceService userPreferenceService;
    private RatioService ratioService;

    @Autowired
    public UserPreferenceController(UserPreferenceService userPreferenceService, RatioService ratioService) {
        this.userPreferenceService = userPreferenceService;
        this.ratioService = ratioService;
    }

    @GetMapping("/form")
    public String form(Model model) {
        UserPreference userPreference = userPreferenceService.getUserPreferenceById(1);
        model.addAttribute("brewingPreference", userPreferenceService.getAllUserPreferences());
        model.addAttribute("userId", userPreference.getBrewMethodId());
        model.addAttribute("userPreference",new UserPreference());
        return "form";
    }

    @PostMapping("/form/{id}")
    public String test(@PathVariable long id, @ModelAttribute("userPreference") UserPreference userPreference, Model model) {
        Ratio userPreferenceRatio = null;
        switch (userPreference.getBrewMethodName()) {
            case "Coffee Machine":
                userPreferenceRatio = ratioService.getRatioById(1);
                break;
            case "Pourover":
                userPreferenceRatio = ratioService.getRatioById(2);
                break;
            case "French Press":
                userPreferenceRatio = ratioService.getRatioById(3);
                break;
            case "Aeropress":
                userPreferenceRatio = ratioService.getRatioById(4);
                break;
        }
        System.out.println(userPreference.toString());
        System.out.println("RATIO" + userPreferenceRatio.getRatioValue());
        
        double water = userPreference.getCups()*236.5;
        double coffee = Math.round(water/userPreferenceRatio.getRatioValue());

        BrewResults brewResults = new BrewResults();
        brewResults.setCoffee(coffee);
        brewResults.setWater(water);

        System.out.println(userPreference);

        brewResults.setMethodName(userPreference.getBrewMethodName());
        model.addAttribute("brewResults", brewResults);
        model.addAttribute("cups", userPreference.getCups());
        return "brew_results";
    }
}
