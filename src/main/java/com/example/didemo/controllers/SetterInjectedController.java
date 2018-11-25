package com.example.didemo.controllers;

import com.example.didemo.services.GreetingService;
import com.example.didemo.services.GreetingServiceImpl;

public class SetterInjectedController {

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private GreetingService greetingService;


}
