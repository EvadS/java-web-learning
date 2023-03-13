package com.se.sample.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherSerlvetInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //instead of web.xml
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        // url pattern
        return new String[]{"/"};
    }
}
