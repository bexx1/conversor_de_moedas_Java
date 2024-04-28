import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRequest {
    String base_code;
    String currencyTo;
    double value;
    double conversionRate;

// CONSTRUCTOR
    public ApiRequest(ValueConverter valueConverter) {
        base_code = valueConverter.getBaseCode();
        currencyTo = valueConverter.getTargetCode();
        value = valueConverter.getConversionResult();
        conversionRate = valueConverter.getConversion_rate();
    }

// METHODS
    public ValueConverter getApiValue() {
        String apiUrl = "https://v6.exchangerate-api.com/v6/123e90fa4658fb5687e2d1b1/pair/" + base_code + "/" + currencyTo + "/" + value;

        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            return gson.fromJson(json, ValueConverter.class);
        } catch (Exception e) {
            throw new RuntimeException("Nao foi possivel converter o valor.");
        }
    }
}
