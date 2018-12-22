package com.sportspro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@Controller
public class HomeController {


    @GetMapping("/")
    public String list(Map<String, Object> model) {
        model.put("this_time",new Date().toString());
        return "welcome";
    }

}
