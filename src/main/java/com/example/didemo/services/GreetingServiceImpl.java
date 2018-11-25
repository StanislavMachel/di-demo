package com.example.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String GREETING = "Hello from GreetingService";

    @Override
    public String sayGreeting() {
        return GREETING;
    }
}
