package com.se.sample.auth;

import com.se.sample.controller.IndexController;
import com.se.sample.service.DocumentService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static org.slf4j.LoggerFactory.getLogger;

@Component
public class PermissionChecker {


    static final Logger logger = LogManager.getLogger(PermissionChecker.class.getName());

    @Autowired
    private DocumentService documentService;

    @PostConstruct
    private  void init(){
        System.out.println("**** PermissionChecker post construct");
        logger.info("PermissionChecker post construct");
    }
}
