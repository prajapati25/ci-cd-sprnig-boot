 package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")
    public String  getInfo (){
        return "Hello From Himanshu New CI CD Project in develop branch with feature";
    }

}
