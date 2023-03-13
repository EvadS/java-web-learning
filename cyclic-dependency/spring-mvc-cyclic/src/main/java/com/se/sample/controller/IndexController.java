package com.se.sample.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;

@RestController
@RequestMapping("/test")
public class IndexController {

    private static final Logger logger = Logger.getLogger(IndexController.class);

    @GetMapping
    public String getHello() {
        logger.info("* get hello request");
        return "Hello world!!1";
    }

    @PostConstruct
    private void init(){
        logger.info("** IndexController created !! ");
    }
}
