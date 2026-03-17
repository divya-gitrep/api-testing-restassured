package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class GetUserTest {

    @Test
    public void getUser() {

        RestAssured.baseURI ="https://reqres.in";

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("User-Agent", "Mozilla/5.0")
                .log().all()
                .when()
                .log().all()
                .get("/users/1")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(1));

    }
}
