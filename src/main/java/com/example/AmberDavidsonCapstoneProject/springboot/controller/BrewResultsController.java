package com.example.AmberDavidsonCapstoneProject.springboot.controller;

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
    public String brewList() {
        return "brew_list";
    }

    // save user's brew
    @PostMapping("/saveBrewResults")
    public String saveBrewResults(@ModelAttribute BrewResults brewResults) {
        brewResultsService.saveBrewResults(brewResults);
        return "brew_list";
    }

    @PostMapping("/deleteBrewResults/{id}")
    public String deleteBrewResults(@PathVariable(value = "id") long id) {

        // call delete user  method
        this.brewResultsService.deleteBrewResultsById(id);
        return "redirect:/brewList";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        httpSession.invalidate();
        return "redirect:/login";
    }
}