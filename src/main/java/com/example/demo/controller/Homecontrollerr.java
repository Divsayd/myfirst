package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class Homecontrollerr {

    @RequestMapping(value={"","/","/home"})

    public String Display(Model model){
    model.addAttribute("Username","Divya");

        return "display.html";
    }




}
