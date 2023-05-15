package edu.craptocraft.resources;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import edu.craptocraft.models.WorldClock;
import edu.craptocraft.models.WorldClockHeaders;
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
        // In case we use param headers:
        /*
         * WorldClockHeaders wordlClockHeaders = new WorldClockHeaders();
         * worldClockHeaders.logger = "DEBUG";
         * 
         * And pass to the method this object:
         * return worldClockService.getNow(worldClockHeaders);
         */

        WorldClockHeaders worldClockHeaders = new WorldClockHeaders();
        worldClockHeaders.logger = "DEBUG";
        return worldClockService.getNow(worldClockHeaders);

        return worldClockService.getNow();
    }

}
