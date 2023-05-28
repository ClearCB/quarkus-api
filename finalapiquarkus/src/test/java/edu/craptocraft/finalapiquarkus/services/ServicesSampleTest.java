package edu.craptocraft.finalapiquarkus.services;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ServicesSampleTest {

    @Inject
    ServicesSample service;

}