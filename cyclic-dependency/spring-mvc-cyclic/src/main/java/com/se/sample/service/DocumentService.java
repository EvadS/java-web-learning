package com.se.sample.service;

import com.se.sample.auth.PermissionChecker;
import com.se.sample.service.AbstractUpdateService;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigInteger;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class DocumentService extends AbstractUpdateService {

    private static final Logger LOG = getLogger(DocumentService.class);

    @PostConstruct
    private  void init(){
        LOG.info("DocumentService post construct");
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
