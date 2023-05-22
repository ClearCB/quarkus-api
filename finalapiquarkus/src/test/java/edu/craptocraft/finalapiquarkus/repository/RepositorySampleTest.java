package edu.craptocraft.finalapiquarkus.repository;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import jakarta.inject.Inject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class RepositorySampleTest {

    @Inject
    RepositorySample repo;

}