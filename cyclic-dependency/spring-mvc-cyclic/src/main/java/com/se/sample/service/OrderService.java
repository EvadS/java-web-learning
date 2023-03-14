package com.se.sample.service;

import com.se.sample.controller.IndexController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigInteger;

@Service
public class OrderService extends AbstractUpdateService {

    static final Logger logger = LogManager.getLogger(OrderService.class.getName());


    @Override
    public Class getDtoClass() {
        return null;
    }

    @Override
    public Object find(BigInteger id) {
        return null;
    }

    @Async
    public void  someAsyncMethod(){
        logger.info("some async method ");
        innerMethod();
    }

    private void innerMethod() {
        logger.info("some async method ->> innerMethod");
    }

    @PostConstruct
    private void init(){
        innerMethod();
    }
}
