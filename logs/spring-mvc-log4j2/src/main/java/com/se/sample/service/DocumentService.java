package com.se.sample.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DocumentService {

    static final Logger logger = LogManager.getLogger(DocumentService.class.getName());


    @PostConstruct
    private void init() {
        logger.info("DocumentService post construct");
    }

}
