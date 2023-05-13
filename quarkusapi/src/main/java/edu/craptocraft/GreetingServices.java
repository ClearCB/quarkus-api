package edu.craptocraft;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped // Every app execution, 1 instance.
public class GreetingServices {

    @ConfigProperty(name = "greetings.message")
    String msg;

    public String toUpperCase() {
        return msg.toUpperCase();
    }
}
