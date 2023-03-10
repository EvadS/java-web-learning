package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/todo")
public class TodoResource {
    @GET
    @Path("/{todo}")
    public String removeTodo(@PathParam("todo") String todoToRemove) {
        // throws a TodoNotFoundException, if the todo can not be found
      return  todoToRemove + "111111";
    }
}
