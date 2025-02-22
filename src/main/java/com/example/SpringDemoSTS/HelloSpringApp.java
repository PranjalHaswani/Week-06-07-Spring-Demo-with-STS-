package com.example.SpringDemoSTS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloSpringApp {

    @GetMapping("/hello")
    public String helloWorldUC1(){
        return "Hello from BridgeLabz";
    }
}
