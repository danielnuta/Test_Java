import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class GetApiTest {
    @Test
    public static void GetApiTest(){

        given()
                .baseUri("https://reqres.in/api")
                .contentType(ContentType.JSON)

        .when()
                .get("/users/2")

        .then()
                .statusCode(200)
                .body("data.id", equalTo(2))
                .body("data.email", equalTo("janet.weaver@reqres.in"))
                .body("data.first_name", equalTo("Janet"))
                .body("data.last_name", equalTo("Weaver"))
                .body("data.avatar", notNullValue())
                .log().all();
    }
}
