package edu.craptocraft.models;

import jakarta.ws.rs.HeaderParam;

public class WorldClockHeaders {

    @HeaderParam("X-Logger")
    String logger;
}
