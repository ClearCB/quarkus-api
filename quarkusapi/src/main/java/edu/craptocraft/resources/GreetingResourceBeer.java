package edu.craptocraft.resources;

import org.jboss.logging.Logger;

import edu.craptocraft.models.Beer;
import edu.craptocraft.services.GreetingServices;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/beer")
public class GreetingResourceBeer {

    Logger logger = Logger.getLogger(GreetingResourceBeer.class);

    @Inject
    GreetingServices services;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Beer getBeer() {
        logger.debug("Hello from log");
        return new Beer("Estrella", 322);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createBeer(@Valid Beer beer) {
        System.out.println(beer);
        return Response.ok().build();
    }
}
