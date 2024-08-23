import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

public class ApiClientTest {private WireMockServer wireMockServer;
    private ApiClient apiClient;

    @Before
    public void setUp() {
        // Start WireMock server
        wireMockServer = new WireMockServer(8080);
        wireMockServer.start();

        // Configure WireMock to listen for HTTP requests on localhost:8080
        WireMock.configureFor("localhost", 8080);

        apiClient = new ApiClient();
    }

    @After
    public void tearDown() {
        // Stop WireMock server
        wireMockServer.stop();
    }

    @Test
    public void testGetUserData_Success() throws Exception {
        // Mock the API endpoint "/users/1" with WireMock
        stubFor(get(urlEqualTo("/users/1"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{ \"id\": 1, \"name\": \"John Doe\" }")));

        // Invoke the method to be tested
        String response = apiClient.getUserData("http://localhost:8080/users/1");

        // Assert that the response is as expected
        assertNotNull(response);
        assertTrue(response.contains("\"name\": \"John Doe\""));
    }

    @Test(expected = RuntimeException.class)
    public void testGetUserData_Failure() throws Exception {
        // Mock the API endpoint "/users/1" to return a 404 status code
        stubFor(get(urlEqualTo("/users/1"))
                .willReturn(aResponse()
                        .withStatus(404)));

        // Call the method and expect it to throw an exception
        apiClient.getUserData("http://localhost:8080/users/1");
    }
}
