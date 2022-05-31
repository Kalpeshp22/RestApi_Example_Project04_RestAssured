package com.restapiexample.dummy.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;


public class TestBase {
    // set up the environment
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";


    }


}