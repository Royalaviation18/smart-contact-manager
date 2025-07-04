package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home Page handler");
        //sending data to the view
        model.addAttribute("name","Flying Officer Rohit Priyadarshi");
        model.addAttribute("Force","Indian Air Force");
        model.addAttribute("ComissionEntry", "AFCAT 2 2025");
        model.addAttribute("web","https://indianairforce.nic.in/");
        return "home";
    }
}
