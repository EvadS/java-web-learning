package com.se.sample;

import com.se.sample.config.ProjectConfig;
import com.se.sample.models.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);

        System.out.println("Parrot: " + p);

        System.out.println("Hello World!");
    }
}
