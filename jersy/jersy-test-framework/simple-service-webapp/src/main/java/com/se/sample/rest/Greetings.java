package com.se.sample.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/greetings")
public class Greetings {

    @GET
    @Path("/hi")
    public String getHiGreeting() {
        return "hi";
    }
}