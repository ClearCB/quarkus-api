package edu.craptocraft.finalapiquarkus.repository;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class RepositorySampleARTest {

    @Inject
    RepositorySampleAR repo;

}