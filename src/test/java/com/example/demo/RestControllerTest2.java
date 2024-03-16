package com.example.demo;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest
public class RestControllerTest2 {

    //    @Test
    public void helloEndpointReturnsHelloWorld() throws Exception {
        RestAssured.baseURI = "http://localhost:8080/";
        given()
                .get("/hello")
                .then()
                .body( equalTo("Hello World!"));

    }

}