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

@Path("/tester")
public class TesterResources {

    @GET
    @Path("/{id}/js")
    @Produces(MediaType.APPLICATION_JSON)
    public Tester getDeveloperJSON(@PathParam("id") Long id) {
        return Tester.findById(id);
    }

    @GET
    @Path("/{id}/txt")
    @Produces(MediaType.TEXT_PLAIN)
    public Tester getDeveloperText(@PathParam("id") Integer id) {
        return Tester.findById(id);
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createDev(Tester tester) {

        tester.persist();
        return Response.created(URI.create("/dev/" + tester.id))
                .build();
    }
}
