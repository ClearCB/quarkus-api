package edu.craptocraft.gettingstarted;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.util.UUID;

@QuarkusTest
public class AppTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/index")
                .then()
                .statusCode(200)
                .body(is("Hello!"));
    }

    @Test
    public void testGreetingEndpoint() {
        String uuid = UUID.randomUUID().toString();
        given()
                .pathParam("name", uuid)
                .when().get("/index/greeting/{name}")
                .then()
                .statusCode(200)
                .body(is("Hello " + uuid));
    }

}