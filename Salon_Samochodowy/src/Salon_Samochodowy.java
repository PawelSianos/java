import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Paweł on 2017-08-31.
 */
public class Salon_Samochodowy implements Zarzadzanie_Salonem {
    List<Samochod> listaSamochodow = new ArrayList<>();

    @Override
    public void dodajSamochod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w kreatorze dodawania samochodow do listy...\nZa pomocą 0 możesz zawsze wyjść.\n wybierz markę samochodu..." +
                "\n1) Ford\n2) Opel");
        while(!scanner.next().equals("0")){
            char wybor = scanner.next().charAt(0);
            String marka = " ";
            if(wybor == '1'){
                marka = "Ford";
            }else if(wybor == '2'){
                marka = "Opel";
            }
            System.out.println("Podaj model samochodu marki " +  marka );
            String model = scanner.next();

        }
    }

    @Override
    public void wyswietlSamochod() {

    }

    @Override
    public void usunSamochod() {

    }

    @Override
    public void wyswietlSzczegoly() {

    }
}
