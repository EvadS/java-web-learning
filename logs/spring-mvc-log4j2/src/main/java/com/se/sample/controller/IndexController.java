package com.se.sample.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/test")
public class IndexController {

    static final Logger logger = LogManager.getLogger(IndexController.class.getName());

    @GetMapping
    public String getHello() {
        logger.info("get hello request");
        return "Hello world!!";
    }

    @PostConstruct
    private void init(){
       logger.info("IndexController created !! ");
    }
}
