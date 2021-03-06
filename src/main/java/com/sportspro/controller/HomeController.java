package com.sportspro.controller;

import com.sportspro.model.entities.User;
import com.sportspro.repository.UserRepository;
import com.sportspro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

//    Logger logger = Logger.getLogger(HomeController.class.getName());

    @GetMapping("/")
    public String home(ModelMap modelMap) {
        return "welcome";
    }
}
