package com.se.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/test")
public class IndexController {


    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping
    public String getHello() {
        logger.info("* get hello request");
        System.out.println("*** get hello request");
        return "Hello world!!1";
    }

    @PostConstruct
    private void init(){
        logger.info("** IndexController created !! ");
    }
}
