package testing;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;

public class Practise {

    @Test(priority = 0)
    public void testMethod(){
        System.out.println("hi");
        RestAssured.baseURI = "https://api.openweathermap.org";
        RestAssured.basePath = "/data";
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .queryParam("lat", "51.5156177")
                .queryParam("lon", "-0.0919983")
                .queryParam("appid","f6fc650e67ad2afb75d6670e1abee559")
                .pathParam("id", 2.5)
                .log().uri()
                .log().parameters()
                .when()
                .get("/{id}/weather")
                .then()
                .log().body()
                .statusCode(200)
                .header("Content-Type", "application/json; charset=utf-8")
                .extract()
                .response();

        System.out.println("response body " + response.getBody().asString());
        System.out.println("content type " + response.getContentType());
        System.out.println("get response time type " + response.getTime());
        System.out.println("status  code " + response.getStatusCode());
        System.out.println("headers " + response.getHeaders());
        System.out.println("response key " + response.jsonPath().get("coord"));
    }


    @Test(priority = 1)
    public void extractJson(){
        System.out.println("test method ");
        RestAssured.baseURI = "https://api.openweathermap.org";
        RestAssured.basePath = "/data";
        Integer response = RestAssured.given()
                .header("Content-Type", "application/json")
                .queryParam("lat", "51.5156177")
                .queryParam("lon", "-0.0919983")
                .queryParam("appid","f6fc650e67ad2afb75d6670e1abee559")
                .pathParam("id", 2.5)
                .when()
                .get("/{id}/weather")
                .then()
                .statusCode(200)
                .header("Content-Type", "application/json; charset=utf-8")
                .extract()
                .path("sys.type");

        System.out.println("data  " + response);
    }

    @Test(priority = 2)
    public void extractJsonList(){
        System.out.println("test method ");
        RestAssured.baseURI = "https://api.openweathermap.org";
        RestAssured.basePath = "/data";
        Integer response = RestAssured.given()
                .header("Content-Type", "application/json")
                .queryParam("lat", "51.5156177")
                .queryParam("lon", "-0.0919983")
                .queryParam("appid","f6fc650e67ad2afb75d6670e1abee559")
                .pathParam("id", 2.5)
                .when()
                .get("/{id}/weather")
                .then()
                .statusCode(200)
                .header("Content-Type", "application/json; charset=utf-8")
                .extract()
                .path("weather[0].id");

        System.out.println("data  " + response);
    }

    @Test(priority = 2)
    public void validateHeader(){
        System.out.println("test method ");
        RestAssured.baseURI = "https://api.openweathermap.org";
        RestAssured.basePath = "/data";
        RestAssured.given()
                .header("Content-Type", "application/json")
                .queryParam("lat", "51.5156177")
                .queryParam("lon", "-0.0919983")
                .queryParam("appid","f6fc650e67ad2afb75d6670e1abee559")
                .pathParam("id", 2.5)
                .when()
                .get("/{id}/weather")
                .then()
                .assertThat()
                .header("Content-Type", "application/json");
    }


}
