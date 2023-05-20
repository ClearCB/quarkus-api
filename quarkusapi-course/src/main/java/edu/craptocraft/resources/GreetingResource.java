package edu.craptocraft.resources;

import edu.craptocraft.models.Order;
import edu.craptocraft.services.ExpensiveService;
import edu.craptocraft.services.GreetingServices;
import jakarta.inject.Inject;
import jakarta.validation.constraints.NotBlank;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriInfo;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingServices services;

    @Inject
    ExpensiveService expensiveService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return services.toUpperCase();
    }

    @GET
    @Path("/calculate")
    @Produces(MediaType.TEXT_PLAIN)
    public int calcuate() {
        return expensiveService.calculate();
    }

    @GET
    @Path("/goodbye")
    @Produces(MediaType.TEXT_PLAIN)
    public String goodBye(@Context UriInfo uriInfo,
            @QueryParam("order") Order order,
            @NotBlank @HeaderParam("authorization") String authorization) {

        return String.format("URI: %s - Order %s - Authorization: %s",
                uriInfo.getAbsolutePath(), order, authorization);
    }
}
