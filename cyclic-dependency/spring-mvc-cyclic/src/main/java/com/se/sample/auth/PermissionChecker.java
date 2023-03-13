package com.se.sample.auth;

import com.se.sample.service.DocumentService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static org.slf4j.LoggerFactory.getLogger;

//@Component
public class PermissionChecker {
    private static final Logger LOG = getLogger(PermissionChecker.class);

  //  @Autowired
  //  private DocumentService documentService;

    @PostConstruct
    private  void init(){
        LOG.info("PermissionChecker post construct");
    }
}
