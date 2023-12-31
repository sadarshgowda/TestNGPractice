package testing;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestPatchMethod {
    @Test(priority = 0)
    public void patch(){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Adarsh");
        jsonObject.put("job", "developer");

        RestAssured.baseURI = "https://reqres.in/";
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .log().all()
                .when()
                .patch("/api/users/277")
                .then()
                .header("Content-Type", "application/json; charset=utf-8")
                .statusCode(200)
                .extract()
                .response();

        Headers header = response.getHeaders();
      /*  for (Header h : header){
            System.out.println("key" + h.get);
        }*/


        System.out.println("response body " + response.body().asString());
    }
}
