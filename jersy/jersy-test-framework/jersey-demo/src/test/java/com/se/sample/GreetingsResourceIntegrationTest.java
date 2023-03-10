package com.se.sample;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GreetingsResourceIntegrationTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(JerseyService.class);
    }

    @Test
    public void givenGetHiGreeting_whenCorrectRequest_thenResponseIsOkAndContainsHi() {
        Response response = target("/greetings/hi").request()
                .get();

        //"Http Response should be 200: "
        assertEquals( Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals( MediaType.TEXT_HTML, response.getHeaderString(HttpHeaders.CONTENT_TYPE), "Http Content-Type should be: ");

        String content = response.readEntity(String.class);
        assertEquals( "hi", content,"Content of ressponse is: ");
    }
}
