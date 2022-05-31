package com.restapiexample.dummy.restapiexampleinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestapiGetTest extends TestBase {
    @Test
    public void getAllEmployeesInfo() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();
        System.out.println(response.statusCode());
    }

    @Test
    public void getSingleProductInfo() {
        Response response = given()
                .basePath("/employee")
                .pathParam("id",3)
                .when()
                .get("{id}");
        response.then().statusCode(200);
        response.prettyPrint();
        System.out.println(response.statusCode());
    }


}


