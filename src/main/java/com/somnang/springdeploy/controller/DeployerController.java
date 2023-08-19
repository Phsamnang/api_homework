package com.somnang.springdeploy.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployerController {
    @GetMapping("/home")
    public String Greeting(){
        //System.out.println("Hello world" );
        return "Deploy Spring Boot Homework";
    }
}
