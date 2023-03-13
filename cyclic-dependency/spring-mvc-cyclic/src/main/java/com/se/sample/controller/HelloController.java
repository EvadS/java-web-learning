package com.se.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Neil Alishev
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello_world";
    }
}
