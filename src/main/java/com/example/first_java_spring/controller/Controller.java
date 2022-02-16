package com.example.first_java_spring.controller;

import com.example.first_java_spring.sevices.DayCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello Spring";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String input)
    {
        return input;
    }

    @GetMapping("/isItFriday")
    public String isItFriday()
    {
        DayCalculator dc = new DayCalculator();
        return dc.isItFriday();
    }
}
