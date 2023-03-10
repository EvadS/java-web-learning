package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/message")
public class JerseyService {
    @GET
    public String getMsg() {
        int a =0;
        return "Hello World !! - Jersey 2";
    }

    @GET
    @Path("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
