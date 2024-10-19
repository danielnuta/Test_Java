
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredTestResponse {

    @Test
    public void GetBookDetails(){

        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";

        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.get("");

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/);
    }

}
