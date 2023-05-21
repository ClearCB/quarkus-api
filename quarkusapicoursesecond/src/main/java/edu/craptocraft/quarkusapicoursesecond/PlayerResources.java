package edu.craptocraft.quarkusapicoursesecond;

import java.net.URI;
import java.sql.Array;
import java.util.List;

import org.wildfly.common.annotation.NotNull;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/player")
public class PlayerResources {

    @Inject
    PlayerRepository playerRepository;

    @GET
    @Path("/{id}/id/txt")
    @Produces(MediaType.TEXT_PLAIN)
    public Player getDeveloperText(@PathParam("id") Long id) {
        return playerRepository.findById(id);
    }

    @GET
    @Path("/{id}/id/js")
    @Produces(MediaType.APPLICATION_JSON)
    public Player getDeveloperJSON(@PathParam("id") Long id) {
        return playerRepository.findById(id);
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> getDevelopers() {

        return playerRepository.findAll().list();
    }

    @GET
    @Path("/{name}/name/js")
    @Produces(MediaType.APPLICATION_JSON)
    public Player getDeveloperPerName(@NotNull @PathParam("name") String name) {
        return playerRepository.find("name", name).firstResult();
    }

    @GET
    @Path("/{name}/{age}")
    @Produces(MediaType.APPLICATION_JSON)
    public Player getDeveloperPerNameAge(@PathParam("name") String name, @PathParam("age") long age) {
        return playerRepository.find("name = ?1 and age = ?2", name, age).firstResult();
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createDev(Player player) {

        playerRepository.create(player);
        return Response.created(URI.create("/dev/" + player.getId()))
                .build();
    }
}
