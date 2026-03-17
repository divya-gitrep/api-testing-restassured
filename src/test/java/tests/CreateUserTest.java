package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import payloads.UserPayload;



public class CreateUserTest {

    @Test
    public void createUser() {

        String payload=UserPayload.createUserPayload();



        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type","application/json")
                .body(payload)

                .when()
                .post("/users")

                .then()
                .statusCode(201)
                .body("name",equalTo("Jane"));

    }




}
