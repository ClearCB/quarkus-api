package edu.craptocraft.resources;

import edu.craptocraft.services.GreetingServices;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingServices services;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return services.toUpperCase();
    }
}
