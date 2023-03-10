package com.se.sample.config;

import com.se.sample.beans.Parrot;
import com.se.sample.beans.ParrotSecond;
import com.se.sample.beans.ParrotThird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }

    // next steps
    @Bean
    ParrotSecond parrotSecond1() {
        var p = new ParrotSecond();
        p.setName("Koko");
        return p;
    }

    @Bean
    ParrotSecond parrotSecond2() {
        var p = new ParrotSecond();
        p.setName("Miki");
        return p;
    }

    @Bean
    ParrotSecond parrotSecond3() {
        var p = new ParrotSecond();
        p.setName("Riki");
        return p;
    }

    @Bean(name="miki")
    ParrotSecond parrotSecondMiki() {
        var p = new ParrotSecond();
        p.setName("Miki");
        return p;
    }
    // ParrotThird block

    @Bean
    ParrotThird parrotThirdRikki() {
        var p = new ParrotThird();
        p.setName("Riki");
        return p;
    }

    @Primary
    @Bean(name="miki")
    ParrotThird parrotThirdMiki() {
        var p = new ParrotThird();
        p.setName("Miki");
        return p;
    }
}
