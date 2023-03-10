package com.example;


import java.util.ArrayList;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;



@Path("/users")
public class UserResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> fetchAll() {
        List<User> users = new ArrayList<User>();
        users.add(new User(100, "A", "demo@gmail.com"));
        users.add(new User(101, "B", "demo1@gmail.com"));
        users.add(new User(102, "C", "demo2@gmail.com"));
        return users;
    }

    @GET
    @Path("user/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") int id) {
        return Response.ok().entity(new User(100, "me", "me@gmail.com")).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(User user) {
        // Add user logic here
        return Response.status(Status.CREATED).build();
    }


    @PUT
    @Path("/user/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") long id, User user) {
        // update user logic here
        return Response.noContent().build();
    }

    @DELETE
    @Path("/user/{id}")
    public Response delete(@PathParam("id") long id) {
        // Delete user logic here
        return Response.status(Status.NO_CONTENT).entity("User deleted successfully !!").build();
    }
}
