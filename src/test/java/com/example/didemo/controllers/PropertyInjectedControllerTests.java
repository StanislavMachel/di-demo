package com.example.didemo.controllers;

import com.example.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTests {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void SetUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreetings() throws Exception {
        assertEquals(GreetingServiceImpl.GREETING, propertyInjectedController.sayHello());
    }
}
