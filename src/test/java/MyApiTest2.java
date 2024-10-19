import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class MyApiTest2 {

    @Test
    public void testGet(){
        RestAssured.baseURI = "http://myapi.com";

        Response response = RestAssured.get("/api/resource");

        response.then().assertThat().statusCode(200);

        response.then().assertThat().body("some/property", equalTo("expected value"));
    }
}
