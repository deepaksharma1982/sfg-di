package com.deepak.sfgdi.controllers;

import com.deepak.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello World!!!");

        //return "Hi Folks!";
        return this.greetingService.sayGreeting();
    }

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


}
