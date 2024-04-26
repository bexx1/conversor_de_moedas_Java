import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRequest {
    public ApiRequest getApi() {
        String apiUrl = "https://v6.exchangerate-api.com/v6/123e90fa4658fb5687e2d1b1/latest/USD";

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ApiRequest.class);
        } catch (Exception e) {
            throw new RuntimeException("Nao foi possivel converter o valor.");
        }
    }
}
