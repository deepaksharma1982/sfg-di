package com.deepak.sfgdi.controllers;

import com.deepak.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService() );

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}