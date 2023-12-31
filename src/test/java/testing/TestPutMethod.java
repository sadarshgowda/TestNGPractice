package testing;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestPutMethod {

    @Test(priority = 0)
    public void put(){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Abhi");
        jsonObject.put("job", "developer");

        RestAssured.baseURI = "https://reqres.in/";
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .log().all()
                .when()
                .put("/api/users/277")
                .then()
                .header("Content-Type", "application/json; charset=utf-8")
                .statusCode(200)
                .extract()
                .response();

        System.out.println("response body " + response.body().asString());
    }
}
