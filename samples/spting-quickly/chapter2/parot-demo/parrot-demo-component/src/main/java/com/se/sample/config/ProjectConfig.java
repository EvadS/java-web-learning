package com.se.sample.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.se.sample")
public class ProjectConfig {

//    @Test
//    @DisplayName("Test that a Parrot instance without a name " +
//            "has been added to the Spring context.")
//    public void testParrotWasAdded() {
//        Parrot p = context.getBean(Parrot.class);
//
//        assertNotNull(p);
//        assertNull(p.getName());
//    }
}
