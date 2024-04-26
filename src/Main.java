import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String apiUrl = "https://v6.exchangerate-api.com/v6/123e90fa4658fb5687e2d1b1/latest/USD";

        HttpClient http = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).build();
        HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());

    }
}