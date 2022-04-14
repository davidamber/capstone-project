package com.example.AmberDavidsonCapstoneProject.springboot.controller;

import com.example.AmberDavidsonCapstoneProject.springboot.model.Brew;
import com.example.AmberDavidsonCapstoneProject.springboot.model.UserList;
import com.example.AmberDavidsonCapstoneProject.springboot.service.BrewService;
import com.example.AmberDavidsonCapstoneProject.springboot.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BrewController {

    @Autowired
    private BrewService brewService;

    @GetMapping("/finalBrew")
    public String finalBrew() {
        return "final_brew";
    }

    // save user's brew
    @PostMapping("/saveBrew")
    public String saveUserList(@ModelAttribute("brew") Brew brew) {
        brewService.saveBrew(brew);
        return "redirect:/finalBrew";
    }

}