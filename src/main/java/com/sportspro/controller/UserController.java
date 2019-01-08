package com.sportspro.controller;

import com.sportspro.model.entities.User;
import com.sportspro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UserController {

    @Autowired
    private UserService userService;

//    Logger logger = Logger.getLogger(HomeController.class.getName());

    @GetMapping("/welcome")
    public String home(ModelMap modelMap) {
        return "welcome";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, Model model) {
        System.out.println(userForm.getEmail());
//        userRepository.save(userForm);
        return "redirect:/welcome";
    }
}
