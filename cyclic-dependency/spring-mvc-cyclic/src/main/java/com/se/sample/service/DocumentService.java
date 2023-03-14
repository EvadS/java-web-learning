package com.se.sample.service;


import com.se.sample.auth.PermissionChecker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigInteger;

@Service
public class DocumentService extends AbstractUpdateService {

    static final Logger logger = LogManager.getLogger(DocumentService.class.getName());

    @Autowired
    private PermissionChecker permissionChecker;

    @PostConstruct
    private void init() {
        logger.info("DocumentService post construct");
    }

    @Override
    public Class getDtoClass() {
        return null;
    }

    @Override
    public Object find(BigInteger id) {
        return null;
    }
}
