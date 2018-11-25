package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;

public class PropertyInjectedController {

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public GreetingService greetingService;


}
