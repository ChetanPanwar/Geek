package com.java.Springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
@GetMapping("/Welcome")
    public String Welcome(){
        return "Welcome to SpringBoot Project";
    }
}
