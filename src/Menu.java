import java.util.Scanner;

public class Menu {
    public void menuInterface() {
        String menu = """
                ********************************************************************
                Currency Converter
                
                1 - USD to BRL
                2 - USD to EUR
                3 - USD to JPY
                4 - BRL to USD
                5 - BRL to EUR
                6 - BRL to JPY
                7 - EUR to USD
                8 - EUR to BRL
                9 - EUR to JPY
                10 - JPY to USD
                11 - JPY to BRL
                12 - JPY to EUR
                13 - Exit
                
                Subtitles:
                * USD - Dollar
                * BRL: Real
                * EUR: Euro
                * JPY: Yen
                
                ********************************************************************
                """;

        int option = 0;
        System.out.println(menu);
        Scanner scanner = new Scanner(System.in);
        System.out.println("** Enter the number that corresponds to the desired option: **");

        while (option != 13) {
            option = scanner.nextInt();
            if(option == 13) {
                break;
            }
        }
    }
}
