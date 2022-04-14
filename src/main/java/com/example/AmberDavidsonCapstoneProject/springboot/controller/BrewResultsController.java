package com.example.AmberDavidsonCapstoneProject.springboot.controller;

import com.example.AmberDavidsonCapstoneProject.springboot.model.BrewResults;
import com.example.AmberDavidsonCapstoneProject.springboot.service.BrewResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BrewResultsController {

    @Autowired
    private BrewResultsService brewService;

    @GetMapping("/brewResults")
    public String finalBrewResults() {
        return "brew_results";
    }

    // save user's brew
    @PostMapping("/saveBrewResults")
    public String saveUserList(@ModelAttribute("brew") BrewResults brewResults) {
        brewService.saveBrewResults(brewResults);
        return "redirect:/brewResults";
    }

}