import java.util.Scanner;

public class Menu {
    public void menuInterface() {
        String menu = """
                **********************************
                Currency Converter
                
                01 - USD to BRL
                02 - USD to EUR
                03 - USD to JPY
                04 - BRL to USD
                05 - BRL to EUR
                06 - BRL to JPY
                07 - EUR to USD
                08 - EUR to BRL
                09 - EUR to JPY
                10 - JPY to USD
                11 - JPY to BRL
                12 - JPY to EUR
                13 - Exit
                
                Subtitles:
                * USD - Dollar
                * BRL - Real
                * EUR - Euro
                * JPY - Yen
                
                **********************************
                """;

        int option = 0;
        while (option != 13) {
            System.out.println(menu);
            System.out.println("** Enter the number that corresponds to the desired option: **");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();

            if(option == 13) {
                System.out.println("Thank you for your time! You're out of the currency converter.");
                break;
            } else if(option == 1) {
            // USD to BRL
                System.out.println("Enter the value to be converted: ");
                double valueToConvert = scanner.nextDouble();

                ValueConverter dollarToReal = new ValueConverter("USD", "BRL", valueToConvert);
                ApiRequest apiRequest = new ApiRequest(dollarToReal);

                System.out.println(apiRequest.getApiValue().toString());

            } else if(option == 2) {
            // USD to EUR
                System.out.println("Enter the value to be converted: ");
                double valueToConvert = scanner.nextDouble();

                ValueConverter dollarToEuro = new ValueConverter("USD", "EUR", valueToConvert);
                ApiRequest apiRequest = new ApiRequest(dollarToEuro);

                System.out.println(apiRequest.getApiValue().toString());

            } else if(option == 3) {
            // USD to JPY
                System.out.println("Enter the value to be converted: ");
                double valueToConvert = scanner.nextDouble();

                ValueConverter dollarToYen = new ValueConverter("USD", "JPY", valueToConvert);
                ApiRequest apiRequest = new ApiRequest(dollarToYen);

                System.out.println(apiRequest.getApiValue().toString());

            } else if(option == 4) {
            // BRL to USD
                System.out.println("Enter the value to be converted: ");
                double valueToConvert = scanner.nextDouble();

                ValueConverter realToDollar = new ValueConverter("BRL", "USD", valueToConvert);
                ApiRequest apiRequest = new ApiRequest(realToDollar);

                System.out.println(apiRequest.getApiValue().toString());

            } else if(option == 5) {
            // BRL to EUR
                System.out.println("Enter the value to be converted: ");
                double valueToConvert = scanner.nextDouble();

                ValueConverter realToEuro = new ValueConverter("BRL", "EUR", valueToConvert);
                ApiRequest apiRequest = new ApiRequest(realToEuro);

                System.out.println(apiRequest.getApiValue().toString());

            } else if(option == 6) {
            // BRL to JPY
                System.out.println("Enter the value to be converted: ");
                double valueToConvert = scanner.nextDouble();

                ValueConverter realToYen = new ValueConverter("BRL", "JPY", valueToConvert);
                ApiRequest apiRequest = new ApiRequest(realToYen);

                System.out.println(apiRequest.getApiValue().toString());

            } else if(option == 7) {
            // EUR to USD
                System.out.println("Enter the value to be converted: ");
                double valueToConvert = scanner.nextDouble();

                ValueConverter euroToDollar = new ValueConverter("EUR", "USD", valueToConvert);
                ApiRequest apiRequest = new ApiRequest(euroToDollar);

                System.out.println(apiRequest.getApiValue().toString());

            } else if(option == 8) {
            // EUR to BRL
                System.out.println("Enter the value to be converted: ");
                double valueToConvert = scanner.nextDouble();

                ValueConverter euroToReal = new ValueConverter("EUR", "BRL", valueToConvert);
                ApiRequest apiRequest = new ApiRequest(euroToReal);

                System.out.println(apiRequest.getApiValue().toString());

            } else if(option == 9) {
            // EUR to JPY
                System.out.println("Enter the value to be converted: ");
                double valueToConvert = scanner.nextDouble();

                ValueConverter euroToYen = new ValueConverter("EUR", "JPY", valueToConvert);
                ApiRequest apiRequest = new ApiRequest(euroToYen);

                System.out.println(apiRequest.getApiValue().toString());

            } else if(option == 10) {
            // JPY to USD
                System.out.println("Enter the value to be converted: ");
                double valueToConvert = scanner.nextDouble();

                ValueConverter yenToDollar = new ValueConverter("JPY", "USD", valueToConvert);
                ApiRequest apiRequest = new ApiRequest(yenToDollar);

                System.out.println(apiRequest.getApiValue().toString());

            } else if(option == 11) {
            // JPY to BRL
                System.out.println("Enter the value to be converted: ");
                double valueToConvert = scanner.nextDouble();

                ValueConverter yenToReal = new ValueConverter("JPY", "BRL", valueToConvert);
                ApiRequest apiRequest = new ApiRequest(yenToReal);

                System.out.println(apiRequest.getApiValue().toString());

            } else if(option == 12) {
            // JPY to EUR
                System.out.println("Enter the value to be converted: ");
                double valueToConvert = scanner.nextDouble();

                ValueConverter dollarToReal = new ValueConverter("JPY", "EUR", valueToConvert);
                ApiRequest apiRequest = new ApiRequest(dollarToReal);

                System.out.println(apiRequest.getApiValue().toString());
            }
        }
    }
}
