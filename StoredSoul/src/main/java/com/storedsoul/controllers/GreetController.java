package com.storedsoul.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController
{
    @RequestMapping
    public String greet()
    {
        return "Hello World";
    }

}
