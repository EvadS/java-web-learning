package com.se.sample;

import com.se.sample.config.ProjectConfig;
import com.se.sample.models.Parrot;
import com.se.sample.models.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        // person есть в контексте
        System.out.println("Person name :" + person.getName());
        // parrot есть в контексте
        System.out.println("Parrot name :" + parrot.getName());

        // есть ли связь
        System.out.println("Person's parrot :" + person.getParrot());


        System.out.println("Hello World!");
    }
}
