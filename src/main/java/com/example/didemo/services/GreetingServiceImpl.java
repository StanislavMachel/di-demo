package com.example.didemo.services;

public class GreetingServiceImpl implements GreetingService {

    public static final String GREETING = "Hello from GreetingService";

    @Override
    public String sayGreeting() {
        return GREETING;
    }
}
