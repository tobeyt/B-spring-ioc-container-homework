package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("prototype")
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        System.out.println("Controller has been called.");
        this.greetingService = greetingService;
    }


    @GetMapping("/greet")
    public String greet() {
        return greetingService.sayHi();
    }

}
