package com.sportspro.controller;

import com.sportspro.model.entities.User;
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

//    private UserRepository userRepository;

//    Logger logger = Logger.getLogger(HomeController.class.getName());

    @GetMapping("/welcome")
    public String home(ModelMap modelMap) {
        return "welcome";
    }

    @RequestMapping(value = "/r", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "signup";
    }

    @RequestMapping(value = "/r", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, Model model) {
//        logger.info(userForm.getEmail());
//        userRepository.save(userForm);
        return "redirect:/welcome";
    }
}
