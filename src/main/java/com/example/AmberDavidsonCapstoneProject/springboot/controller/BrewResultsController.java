package com.example.AmberDavidsonCapstoneProject.springboot.controller;

import com.example.AmberDavidsonCapstoneProject.springboot.service.BrewResultsServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.AmberDavidsonCapstoneProject.springboot.model.BrewResults;
import com.example.AmberDavidsonCapstoneProject.springboot.model.UserList;
import com.example.AmberDavidsonCapstoneProject.springboot.service.BrewResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class BrewResultsController {

    @Autowired
    private BrewResultsService brewResultsService;

    @GetMapping("/brewResults")
    public String finalBrewResults() {
        return "brew_results";
    }

    @GetMapping("/brewList")
    public String brewList(Model model) {
        model.addAttribute("listBrewResults", brewResultsService.getAllBrewResults());
        return "brew_list";
    }

    // save user's brew
    @PostMapping("/saveBrewResults")
    public String saveBrewResults(@ModelAttribute BrewResults brewResults, Model model) {
        System.out.println(brewResults.toString());
        System.out.println(brewResults.getMethodName());
        System.out.println(brewResults.getWater());
        System.out.println(brewResults.getCoffee());
        brewResultsService.saveBrewResults(brewResults);

        Logger logger = LoggerFactory.getLogger(BrewResultsServiceImpl.class);
        logger.info("BrewResultsServiceImpl: Brew with id " + brewResults.getId() + " has been saved to user id " + brewResults.getUserId());

        model.addAttribute("brewResults", brewResults);
        model.addAttribute("listBrewResults", brewResultsService.getAllBrewResults());
        return "brew_list";
    }

    @GetMapping("/showFormForBrewUpdate/{id}")
    public String showFormForBrewUpdate(@PathVariable(value = "id") long id, Model model) {
        BrewResults brewResults = brewResultsService.getBrewResultsById(id);
        model.addAttribute("brewResults", brewResults);
        return "update_brew";
    }

    @PostMapping("/deleteBrew/{id}")
    public String deleteBrew(@PathVariable(value = "id") long id) {

        // call delete user  method
        this.brewResultsService.deleteBrewResultsById(id);
        return "redirect:/brewList";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();
        return "redirect:/login";
    }
}
