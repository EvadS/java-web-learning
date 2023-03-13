package com.se.sample.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan("com.se.sample")
public class MyConfig implements WebMvcConfigurer {


    private final static Logger logger = LoggerFactory.getLogger(MyConfig.class);

//    @Autowired
//    private List<AbstractSecuredTypeService> services;


    @PostConstruct
    private void init() {
        logger.info("MyConfig post construct");
    }


//    @Autowired
//    private PermissionChecker permissionChecker;

}
