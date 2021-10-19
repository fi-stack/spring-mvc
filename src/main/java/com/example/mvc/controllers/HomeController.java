package com.example.mvc.controllers;

import com.example.mvc.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public String welcome(Model model) {
        String title = "Hello world!";
        model.addAttribute("title", title);
        model.addAttribute("products", productService.findAll());
        return "index";
    }

}