package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        System.out.println("Controller has been called.");
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet() {
        return new GreetingService().sayHi();
    }

}
