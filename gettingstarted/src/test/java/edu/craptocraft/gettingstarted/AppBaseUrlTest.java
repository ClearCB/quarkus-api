package edu.craptocraft.gettingstarted;

import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AppBaseUrlTest {

    @TestHTTPResource("/index")
    URL baseUrl;

    @Test
    public void testGreetingEndpoint() {
        given()
                .baseUri(baseUrl.toString())
                .pathParam("name", "John")
                .when()
                .get("/greeting/{name}")
                .then()
                .statusCode(200)
                .body(is("Hello John"));
    }

    @Test
    public void testDefaultGreeting() {
        given()
                .baseUri(baseUrl.toString())
                .when()
                .get()
                .then()
                .statusCode(200)
                .body(is("Hello!"));

    }
}