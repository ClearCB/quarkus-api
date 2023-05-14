package edu.craptocraft.resources;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import edu.craptocraft.models.Beer;
import edu.craptocraft.models.WorldClock;
import edu.craptocraft.services.GreetingServices;
import edu.craptocraft.services.WorldClockService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/time")
public class GreetingResourceNow {

    @Inject
    @RestClient
    WorldClockService worldClockService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public WorldClock getNow() {
        return worldClockService.getNow();
    }

}
