package com.se.sample.config;


import com.se.sample.auth.PermissionChecker;
import com.se.sample.service.AbstractSecuredTypeService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

//@Configuration
//@ComponentScan("com.se.sample")
public class MyConfig {

    private static final Logger LOG = getLogger(MyConfig.class);

//    @Autowired
//    private List<AbstractSecuredTypeService> services;


    @PostConstruct
    private  void init(){
        LOG.info("MyConfig post construct");
    }


//    @Autowired
//    private PermissionChecker permissionChecker;

}
