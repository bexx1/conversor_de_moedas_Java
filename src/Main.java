public class Main {
    public static void main(String[] args) {
        ValueConverter dolarToReal = new ValueConverter("USD", "BRL", 50);
        ApiRequest apiRequest = new ApiRequest(dolarToReal);

        System.out.println(apiRequest.getApiValue());
    }

}