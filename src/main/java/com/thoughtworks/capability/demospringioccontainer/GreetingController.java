package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

@RestController
@Scope("singleton")
public class GreetingController {

    private final GreetingService greetingService;
    private final WebApplicationContext webApplicationContext;

    public GreetingController(GreetingService greetingService, WebApplicationContext webApplicationContext) {
        System.out.println("Controller has been called.");
        this.greetingService = greetingService;
        this.webApplicationContext = webApplicationContext;
    }

    @GetMapping("/greet")
    public String greet() {
        return webApplicationContext.getBean(GreetingService.class).sayHi();
    }

}
