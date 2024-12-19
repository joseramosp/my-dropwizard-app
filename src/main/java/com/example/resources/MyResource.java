package com.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myresource")
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {

    @GET
    public String getMessage() {
        return "{\"message\": \"Hello, Dropwizard!\"}";
    }
}