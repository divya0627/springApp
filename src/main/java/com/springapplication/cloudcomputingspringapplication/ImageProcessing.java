package com.springapplication.cloudcomputingspringapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageProcessing {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome!";
    }
}
