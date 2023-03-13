package com.se.sample.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.math.BigInteger;

@Service
public class DocumentService extends AbstractUpdateService {

    private final static Logger logger = LoggerFactory.getLogger(DocumentService.class);
    @PostConstruct
    private  void init(){
        System.out.println("**** DocumentService post construct");
        logger.info("DocumentService post construct");
    }

    @Override
    public Class getDtoClass()  {
        return null;
    }

    @Override
    public Object find(BigInteger id) {
        return null;
    }
}
