import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class MagentoProductTest {
    @Test
    public void testGetProductDetails(){
        String productId = "1";

        given()
                .when()
                .get("https://magento.softwaretestingboard.com/rest/V1/products/" + productId)
                .then()
                .statusCode(200)
                .body("sku", equalTo("24-MB01"));
    }
}
