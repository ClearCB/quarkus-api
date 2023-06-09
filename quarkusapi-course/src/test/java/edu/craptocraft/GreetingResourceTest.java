package edu.craptocraft;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@QuarkusTestResource(HellowordlQuarkusTestResourceLifeCycleManager.class)
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when()
                .get("/hello")
                .then()
                .statusCode(200)
                .body(is("ALOHA TEST"));
    }

}