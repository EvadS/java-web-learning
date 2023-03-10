package com.se.sample;

import com.se.sample.beans.Parrot;
import com.se.sample.beans.ParrotSecond;
import com.se.sample.beans.ParrotThird;
import com.se.sample.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    //Создание экземпляра контекста Spring
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // поиск бина в контесте
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);

        // several beans by type -- >.NoUniqueBeanDefinitionException
        //var  beans = context.getBean(ParrotSecond.class);

        // get by bean name
        ParrotSecond parrotSecond3 = context.getBean("parrotSecond3", ParrotSecond.class);
        System.out.println(p.getName());


        ParrotThird parrotThird = context.getBean(ParrotThird.class);
        System.out.println(parrotThird);

        int a =0;
    }
}
