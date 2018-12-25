package com.sportspro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class HomeController {


    @GetMapping("/")
    public String list(Map<String, Object> model) {
        model.put("this_time", new Date().toString());
        return "welcome";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
