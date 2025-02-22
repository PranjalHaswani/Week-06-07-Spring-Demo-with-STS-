package com.example.SpringDemoSTS;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloSpringApp {

    @GetMapping("/hello")
    public String helloWorldUC1() {
        return "Hello from BridgeLabz";
    }

    //  UC2: MVC with Thymeleaf - Returns a web page
    @GetMapping("/web-hello")
    public String displayMessageUC2(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        return "Hello from BridgeLabz";
    }
}
