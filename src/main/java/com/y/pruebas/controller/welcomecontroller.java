package com.y.pruebas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class welcomecontroller {
    
    @GetMapping
    public String welcome() {
       return "Welcome";
    } 

    @GetMapping("/pruebas")
    public String pruebas() {
        return "pruebas";
    }
    
}
