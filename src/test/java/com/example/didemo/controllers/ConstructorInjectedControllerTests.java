package com.example.didemo.controllers;

import com.example.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTests {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void SetUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreetings() throws Exception {
        assertEquals(GreetingServiceImpl.GREETING, this.constructorInjectedController.sayHello());
    }
}
