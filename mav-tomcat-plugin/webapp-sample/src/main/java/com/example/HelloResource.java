package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class HelloResource {
    @GET
    public String getHello() {
        return "Hello World!";
    }

    @GET
    @Path("/{todo}")
    public void removeTodo(@PathParam("todo") String todoToRemove) {
        // throws a TodoNotFoundException, if the todo can not be found
        //todoService.removeTodo(todoToRemove);
    }
}

