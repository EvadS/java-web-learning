package com.example;

import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.spi.container.grizzly.web.GrizzlyWebTestContainerFactory;
import com.sun.jersey.test.framework.spi.container.grizzly.GrizzlyTestContainerFactory;
import org.junit.Assert;
import org.junit.Test;

public class GreetingsResourceIntegrationTest extends JerseyTest {

    public GreetingsResourceIntegrationTest()throws Exception {
        super("com.example");
    }

    @Test
    public void testHelloWorld() {
        WebResource webResource = resource();

        String responseMsg = webResource.path("/hello").get(String.class);
        Assert.assertEquals("Hello World!", responseMsg);
    }
}