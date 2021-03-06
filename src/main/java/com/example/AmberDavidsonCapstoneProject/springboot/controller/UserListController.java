package com.example.AmberDavidsonCapstoneProject.springboot.controller;

import com.example.AmberDavidsonCapstoneProject.springboot.model.UserList;
import com.example.AmberDavidsonCapstoneProject.springboot.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserListController {

    @Autowired
    private UserListService userListService;

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    // display list of users
    @GetMapping("/userList")
    public String viewUserList(Model model) {
        model.addAttribute("listUserLists", userListService.getAllUserLists());
        return "user_list";
    }

//    @GetMapping("/register")
//    public String showNewUserListForm(Model model) {
//        // create model attribute to bind form data
//        UserList userList = new UserList();
//        model.addAttribute("userList", userList);
//        return "register";
//    }

    @PostMapping("/saveUserList")
    public String saveUserList(@ModelAttribute("userList") UserList userList) {
        // save user to database
        userListService.saveUserList(userList);
        return "redirect:/userList";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        // get user from the service
        UserList userList = userListService.getUserListById(id);

        // set user as a model attribute to pre-populate the form
        model.addAttribute("userList", userList);
        return "update_user";
    }

    @PostMapping("/deleteUserList/{id}")
    public String deleteUserList(@PathVariable(value = "id") long id) {

        // call delete employee method
        this.userListService.deleteUserListById(id);
        return "redirect:/userList";
    }

    // Map 'sign-up' button to account creation
    @GetMapping("/newUserListForm")
    public String signup() {
        return "register";
    }

}
