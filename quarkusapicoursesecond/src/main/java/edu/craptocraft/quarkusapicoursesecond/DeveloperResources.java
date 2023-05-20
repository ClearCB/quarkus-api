package edu.craptocraft.quarkusapicoursesecond;

import java.net.URI;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/dev")
public class DeveloperResources {

    @Inject
    EntityManager entityManager;

    @GET
    @Path("/{id}/js")
    @Produces(MediaType.APPLICATION_JSON)
    public Developer getDeveloperJSON(@PathParam("id") Integer id) {
        return entityManager.find(Developer.class, id);
    }

    @GET
    @Path("/{id}/txt")
    @Produces(MediaType.TEXT_PLAIN)
    public Developer getDeveloperText(@PathParam("id") Integer id) {
        return entityManager.find(Developer.class, id);
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createDev(Developer dev) {

        entityManager.persist(dev);
        return Response.created(URI.create("/dev/" + dev.getId()))
                .build();
    }
}
