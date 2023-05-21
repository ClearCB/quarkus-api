package edu.craptocraft.quarkusapicoursesecond;

import java.net.URI;
import java.util.List;

import org.wildfly.common.annotation.NotNull;

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
    @Path("/{id}/id/txt")
    @Produces(MediaType.TEXT_PLAIN)
    public Tester getDeveloperText(@PathParam("id") Integer id) {
        return Tester.findById(id);
    }

    @GET
    @Path("/{id}/id/js")
    @Produces(MediaType.APPLICATION_JSON)
    public Tester getDeveloperJSON(@PathParam("id") Long id) {
        return Tester.findById(id);
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tester> getDevelopers() {

        return Tester.findAll().list();
    }

    @GET
    @Path("/{name}/name/js")
    @Produces(MediaType.APPLICATION_JSON)
    public Tester getDeveloperPerName(@NotNull @PathParam("name") String name) {
        return Tester.find("name", name).firstResult();
    }

    @GET
    @Path("/{name}/{age}")
    @Produces(MediaType.APPLICATION_JSON)
    public Tester getDeveloperPerNameAge(@PathParam("name") String name, @PathParam("age") long age) {
        return Tester.find("name = ?1 and age = ?2", name, age).firstResult();
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
