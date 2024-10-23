package com.proj.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloCOntroller {

    @GetMapping("")
    public String sayHello() {
        return "Hello World hhh";
    }
}
