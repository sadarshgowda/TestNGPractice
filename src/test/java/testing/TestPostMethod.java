package testing;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestPostMethod {
    @Test(priority = 0)
    public void post(){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Adarsh");
        jsonObject.put("job", "sdet");

        RestAssured.baseURI = "https://reqres.in/";
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .log().all()
                .when()
                .post("/api/users")
                .then()
                .header("Content-Type", "application/json; charset=utf-8")
                .statusCode(201)
                .extract()
                .response();

        System.out.println("response body " + response.body().asString());
    }
}
