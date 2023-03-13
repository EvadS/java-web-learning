package com.se.sample.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class MySpringMvcDispatcherSerlvetIntitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //исполняет роль web.xml
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        // url pattern
        // куда посылать все запросы
        return new String[]{"/"};
    }
}
