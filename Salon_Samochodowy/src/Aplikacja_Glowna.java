import java.util.Scanner;

/**
 * Created by Paweł on 2017-08-31.
 */
public class Aplikacja_Glowna {
    public static void main(String... args) {
        System.out.println("Witam w programie zarządzania salonem samochodów używanych" +
                "Wybierz salon który chcesz obsłużyć:\n1) Warszawa\n2) Lódź");
        Scanner scanner = new Scanner(System.in);
        String wybor = scanner.next();
        if (wybor == "1") {
            System.out.println("Witamy w salonie w Warszawie");
            menu();
        } else if (wybor == "2") {
            System.out.println("Witamy w salonie w Lodzi");
            menu();
        } else if (scanner.next().length() > 1){
            System.out.println("Spróbuj ponownie");
            main();
        }else {
            System.out.println("Sprobuj ponownie");
            main();
        }
    }

    public static void menu() {
        System.out.println("Co chesz zrobić?\n1 Dodaj nowy samochod\n2 Wywietl listę samochodow\n"
                + "3 Wyszukaj auto marzeń\n4 Usuń samochód z oferty");
        Scanner choice = new Scanner(System.in);
        char wyborZadania = '0';
        while (wyborZadania != 1 && wyborZadania != 2 && wyborZadania != 3 && wyborZadania != 4) {
            wyborZadania = choice.next().charAt(0);
            if (wyborZadania == '1') {
                System.out.println("Rozpoczynam dodawanie nowego auta");
            } else if (wyborZadania == '2') {
                System.out.println("Wywietlam listę aut");
            } else if (wyborZadania == '3') {
                System.out.println("Wyszukuję auto Twoich marzeń");
            } else if (wyborZadania == '4') {
                System.out.println("Usuwam złom z oferty");
            } else {
                System.out.println("Podales błędny znak \nspróbuj ponownie");
            }
        }
    }
}
