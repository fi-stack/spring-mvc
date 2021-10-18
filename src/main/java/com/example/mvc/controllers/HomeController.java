package com.example.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {
    @GetMapping
    public String welcome(Model model) {
        String message = "Hello world!";
        model.addAttribute("msg", message);
        return "index";
    }

}