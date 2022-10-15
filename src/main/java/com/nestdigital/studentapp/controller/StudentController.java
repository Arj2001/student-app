package com.nestdigital.studentapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String homePage(){
        return "<h1>You are in Home Page</h1>";
    }

    @GetMapping("/contact")
    public String contactPage(){
        return "You are in contact page";
    }
}
