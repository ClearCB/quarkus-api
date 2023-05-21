package edu.craptocraft.finalapiquarkus.resources;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.finalapiquarkus.models.Sample;
import edu.craptocraft.finalapiquarkus.services.ServicesSample;
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

@Path("/base")
public class ResourcesSample {

    @Inject
    ServicesSample servicesSample;

    // curl localhost:8080/base/list
    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Sample> list() {
        return servicesSample.list();
    }

    // curl localhost:8080/base/get/1
    @Path("/get/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(@PathParam("id") long id) {

        Optional<Sample> sample = servicesSample.getSample(id);

        return sample.isPresent()
                ? Response.status(Response.Status.OK).entity(sample.get()).build()
                : Response.status(Response.Status.NOT_FOUND).build();
    }

    // curl -d "{\"id\":\"12\",\"name\":\"SampleOne\"}" -X POST -H "Content-Type:
    // application/json" localhost:8080/base
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Sample post(Sample sample) {
        return servicesSample.add(sample);
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
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public String delete(Sample sample) {
        servicesSample.remove(sample);
        return "Deleted data";
    }
}
