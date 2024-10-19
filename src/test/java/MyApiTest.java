import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class MyApiTest {

    @Test
    public void testGet(){
        RestAssured
                .get("http://my-api.com/resource/123")
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON)
                .and()
                .body("id", equalTo(123));
    }
}
