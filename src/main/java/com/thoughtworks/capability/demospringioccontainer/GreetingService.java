package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class GreetingService {
    public GreetingService() {
        System.out.println("service has been called.");
    }

    String sayHi() {
        return "hello world";
    }
}
