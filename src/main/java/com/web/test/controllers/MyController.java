package com.web.test.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/getData")
    public String getData(){
        return  "data";
    }
}
