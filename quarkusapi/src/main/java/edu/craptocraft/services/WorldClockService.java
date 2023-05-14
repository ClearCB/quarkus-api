package edu.craptocraft.services;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import edu.craptocraft.models.WorldClock;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

/**
 * WorldClockService
 */
@Path("/api")
@RegisterRestClient
public interface WorldClockService {

    // How to interact with an external API
    @GET
    @Path("/json/cet/now")
    @Produces(MediaType.APPLICATION_JSON)
    WorldClock getNow();
}