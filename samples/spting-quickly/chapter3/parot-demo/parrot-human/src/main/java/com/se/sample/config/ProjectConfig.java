package com.se.sample.config;

import com.se.sample.models.Parrot;
import com.se.sample.models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Person person(){
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot());

        return  p;
    }

    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Koko");

        return  p;
    }


}
