package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping("/sayHello")
    public String sayHello()
    {
        return "Welcome to csi";
    }


    @GetMapping("/service")
    public String service()
    {
        return "SOFTWARE DEVELOPMENT";
    }
    @GetMapping("/loanservices")
    public String loanservice()
    {
        return "welcome to SOFTWARE DEVELOPMENT";
    }
}
