package com.restapiexample.dummy.restapiexampleinfo;

import com.restapiexample.dummy.model.RestApiPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestapiPostTest extends TestBase {
    @Test
    public void createEmployeeTest() {
        RestApiPojo restApiPojo = new RestApiPojo();
        restApiPojo.setName("Robert Hunter");
        restApiPojo.setSalary("400000");
        restApiPojo.setAge("45");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(restApiPojo)
                .when()
                .post("/create");
        response.prettyPrint();
        response.then().statusCode(200);
        System.out.println(response.statusCode());


    }
}
