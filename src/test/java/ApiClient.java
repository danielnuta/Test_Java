import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ApiClient { public String getUserData(String apiUrl) throws IOException {
    URL url = new URL(apiUrl);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.connect();

    int responseCode = conn.getResponseCode();
    if (responseCode != 200) {
        throw new RuntimeException("Failed: HTTP error code: " + responseCode);
    }

    Scanner sc = new Scanner(url.openStream());
    StringBuilder inline = new StringBuilder();
    while (sc.hasNext()) {
        inline.append(sc.nextLine());
    }
    sc.close();

    return inline.toString();
}
}
