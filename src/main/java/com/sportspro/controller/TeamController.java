package com.sportspro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {


    @GetMapping("/team")
    public String charts(ModelMap modelMap) {
        return "team";
    }
}
