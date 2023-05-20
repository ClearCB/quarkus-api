package edu.craptocraft;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import edu.craptocraft.services.ExpensiveService;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExpensiveServiceTest {

    // @InjectMocks
    // ExpensiveService expensiveService;

    // @Test
    // public void testCalculate() {
    // Mockito.when(expensiveService.calculate()).thenReturn(50);

    // given()
    // .when()
    // .get("/hello/calculate")
    // .then()
    // .statusCode(200)
    // .body(is(50));
    // }
}
