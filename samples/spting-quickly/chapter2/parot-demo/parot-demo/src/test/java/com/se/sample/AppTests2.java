package com.se.sample;


import com.se.sample.beans.Parrot;
import com.se.sample.beans.ParrotSecond;
import com.se.sample.config.ProjectConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ProjectConfig.class })

public class AppTests2 {

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Test that Parrot instance named parrot1 has the name Koko.")
    public void testParrot1HasTheNameKoko() {
        ParrotSecond p = context.getBean("parrot1", ParrotSecond.class);

        assertEquals("Koko", p.getName());
    }

    @Test
    @DisplayName("Test that Parrot instance named parrot2 has the name Miki.")
    public void testParrot2HasTheNameMiki() {
        ParrotSecond p = context.getBean("parrot2", ParrotSecond.class);

        assertEquals("Miki", p.getName());
    }

    @Test
    @DisplayName("Test that Parrot instance named parrot3 has the name Riki.")
    public void testParrot3HasTheNameRiki() {
        ParrotSecond p = context.getBean("parrot3", ParrotSecond.class);

        assertEquals("Riki", p.getName());
    }
}
