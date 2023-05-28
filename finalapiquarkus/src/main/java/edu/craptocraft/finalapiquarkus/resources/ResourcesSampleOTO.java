package edu.craptocraft.finalapiquarkus.resources;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.finalapiquarkus.models.SampleOTO;
import edu.craptocraft.finalapiquarkus.services.ServicesSampleOTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/baseOTO")
public class ResourcesSampleOTO {

    @Inject
    ServicesSampleOTO servicesSampleMTO;

    // curl localhost:8080/base/list
    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SampleOTO> list() {
        return servicesSampleMTO.list();
    }

    // curl localhost:8080/base/get/1
    @Path("/get/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOne(@PathParam("id") long id) {

        Optional<SampleOTO> SampleOTO = servicesSampleMTO.getSample(id);

        return SampleOTO.isPresent()
                ? Response.status(Response.Status.OK).entity(SampleOTO.get()).build()
                : Response.status(Response.Status.NOT_FOUND).build();
    }

    // curl -d "{\"id\":\"12\",\"name\":\"SampleOne\"}" -X POST -H "Content-Type:
    // application/json" localhost:8080/base
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public SampleOTO post(SampleOTO SampleOTO) {
        servicesSampleMTO.add(SampleOTO);
        return SampleOTO;
    }

    // curl -X PUT -H "Content-Type:
    // application/json" localhost:8080/base/get/1
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public String update() {
        return "UPDATE";
    }

    // curl -d "{\"id\":\"12\",\"name\":\"SampleOne\"}" -X POST -H "Content-Type:
    // application/json" localhost:8080/base/get/1
    @Path("/{id}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public SampleOTO delete(SampleOTO SampleOTO) {
        servicesSampleMTO.remove(SampleOTO);
        return SampleOTO;
    }
}
