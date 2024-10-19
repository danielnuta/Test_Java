import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class NewApi {

    @Test
    public void test1(){

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Time: " + response.getTime());
    }
}
