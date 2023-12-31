package testing;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.*;
import io.restassured.authentication.*;

public class Authentication {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before class");
    }

    @Test
    public void basicAuthentication(){
        RestAssured.baseURI = "https://postman-echo.com/";

        Assert.assertEquals(1,1);
        RestAssured.given()
                .auth()
                .basic("postman","password")
                .log().all()
                .when()
                .get("basic-auth")
                .then()
                .statusCode(200);
    }

    @Test
    public void bearerTokenAuthentication(){
        RestAssured.baseURI = "https://gorest.co.in";

        Response response = RestAssured.given()
                .header("Authorization", "Bearer 10720e420b981ccf43d3b474c377c72e37cafadbcc3f9e9448549f7dea116312")
                .log().all()
                .when()
                .get("/public/v2/users")
                .then()
                .statusCode(200)
                .extract()
                .response();
    }

}
