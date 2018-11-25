package com.example.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(){
        System.out.println("Hello, World!");

        return "foo";
    }
}
