package com.example.didemo.controllers;

import com.example.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTests {
    private SetterInjectedController setterInjectedController;

    @Before
    public void SetUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreetings() throws Exception {
        assertEquals(GreetingServiceImpl.GREETING, this.setterInjectedController.sayHello());
    }
}
