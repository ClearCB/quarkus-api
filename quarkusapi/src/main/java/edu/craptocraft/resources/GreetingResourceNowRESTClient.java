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
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;

@Path("/time")
public class GreetingResourceNowRESTClient {

    @Inject
    @RestClient
    WorldClockService worldClockService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public WorldClock getNow() {

        return ClientBuilder.newClient().target("http://worldclockapi.com") // Elegir dominio, tambien se pueden añadir
                                                                            // los headers
                .path("/api/json/cet/now") // Elegir path
                .request() // Creacion de una request
                .get(WorldClock.class); // Metodo utilizado: en este caso get

    }

}
