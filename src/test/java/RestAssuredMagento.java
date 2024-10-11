import io.restassured.RestAssured;
import org.junit.Test;

public class RestAssuredMagento {

    @Test
    public void testHomePageStatus(){
        RestAssured.given()
                .when()
                .get("https://magento.softwaretestingboard.com")
                .then()
                .statusCode(200);
    }
}
