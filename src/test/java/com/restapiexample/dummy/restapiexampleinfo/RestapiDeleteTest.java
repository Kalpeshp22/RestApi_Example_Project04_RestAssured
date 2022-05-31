package com.restapiexample.dummy.restapiexampleinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestapiDeleteTest extends TestBase {
    @Test
    public void deleteAllProductInfo() {
        Response response = given()
                .pathParam("id",3335)
                .when()
                .delete("/delete/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
        System.out.println(response.statusCode());
    }

}


