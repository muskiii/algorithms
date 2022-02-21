package com.prontera.algorithms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelpController {

    @GetMapping("/help")
    public String listControllers(){
        return "Algorithms available: \n" +
                "/quick-sort \n" +
                "/merge-sort";
    }

}
