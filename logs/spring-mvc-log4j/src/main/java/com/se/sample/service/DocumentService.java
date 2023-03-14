package com.se.sample.service;


import com.se.sample.controller.IndexController;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;

@Service
public class DocumentService  {

    private static final Logger logger = Logger.getLogger(IndexController.class);


    @PostConstruct
    private void init() {
        logger.info("DocumentService post construct");
    }

}
