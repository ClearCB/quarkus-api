package edu.craptocraft.finalapiquarkus.resources;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ResourcesSampleARTest {

    @Test
    public void testBaseList() {
        given()
                .when().get("/baseAR/list")
                .then()
                .statusCode(200)
                .body(is(
                        "[{\"id\":1,\"name\":\"Apple\"},{\"id\":2,\"name\":\"Orange\"},{\"id\":3,\"name\":\"Lemon\"}]"));
    }

}