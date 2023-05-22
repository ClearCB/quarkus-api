package edu.craptocraft.finalapiquarkus.resources;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ResourcesSampleMTOTest {

    @Test
    public void testBaseList() {
        given()
                .when().get("/baseMTO/list")
                .then()
                .statusCode(200)
                .body(is(
                        "[{\"id\":1,\"name\":\"ApplePEN\",\"sampleOTM\":{\"id\":3,\"name\":\"Lemon\"}},{\"id\":2,\"name\":\"Orange\",\"sampleOTM\":{\"id\":2,\"name\":\"Orange\"}},{\"id\":3,\"name\":\"Lemon\",\"sampleOTM\":{\"id\":1,\"name\":\"PineapplePEN\"}}]"));
    }

}