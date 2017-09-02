import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Date;
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
            System.out.println("Wybierz kolor auta:\n1) Biały\t2) Czarny\t3) Czerwony\n4) Niebieski\t5) Żółty\t6) Srebrny\n");
            Kolory kolor = Kolory.BIALY;
            wybor = scanner.next().charAt(0);
            if (wybor == '1'){
                kolor = Kolory.BIALY;
            } else if (wybor == '2'){
                kolor = Kolory.CZARNY;
            } else if (wybor == '3'){
                kolor = Kolory.CZERWONY;
            } else if (wybor == '4'){
                kolor = Kolory.NIEBIESKI;
            } else if (wybor == '5'){
                kolor = Kolory.ZOLTY;
            } else if (wybor == '6'){
                kolor = Kolory.SREBRNY;
            } else
                System.out.println("Podano zły kolor spróbuj ponownie");

            System.out.println("Wybierz typ nadwozia:\n 1) Hatchback\n2) Combi\n3) Sedan\n4) Van\n5) Cabrio");
            Typ_Nadwozia nadwozie = Typ_Nadwozia.HATCHBACK;
            wybor = scanner.next().charAt(0);
            if (wybor == '1'){
                nadwozie = Typ_Nadwozia.HATCHBACK;
            } else if (wybor == '2'){
                nadwozie = Typ_Nadwozia.COMBI;
            } else if (wybor == '3'){
                nadwozie = Typ_Nadwozia.SEDAN;
            } else if (wybor == '4'){
                nadwozie = Typ_Nadwozia.VAN;
            } else if (wybor == '5'){
                nadwozie = Typ_Nadwozia.CABRIO;
            }  else
                System.out.println("Podano zły typ nadwozia spróbuj ponownie");

            System.out.println("Wybierz rodzaj silnika:\n1) Benzyna\t2) Diesel");
            Rodzaj_Silnika silnik = Rodzaj_Silnika.DIESEL;
            wybor = scanner.next().charAt(0);
            if (wybor == '1'){
                silnik = Rodzaj_Silnika.BENZYNA;
            } else if (wybor == '2'){
                silnik = Rodzaj_Silnika.DIESEL;
            } else
                System.out.println("Podano zły rodzaj silnika, spróbuj ponownie");

            System.out.println("a teraz podaj pojemność silnika w dm^3");
            int pojemnosc = scanner.nextInt();
            System.out.println("Teraz zajmiemy się datą produkcji:\nPodaj rok produkcji");
            int rokProdukcji = scanner.nextInt();
            System.out.println("Podaj miesiac produkcji 1 - styczneń, 2 - luty...itp.");
            int miesiacProdukcji = scanner.nextInt();
            System.out.println("a teraz dzień produkcji...");
            int dzienProdukcji = scanner.nextInt();
            Date dataProdukcji = new Date(rokProdukcji, miesiacProdukcji, dzienProdukcji);
            System.out.println("Podaj ilosc przejechanych km..");
            long przebieg = scanner.nextLong();
            System.out.println("Wprowadź datę pierwszej rejestracji...\nPodaj rok");
            int rokRejestracji = scanner.nextInt();
            System.out.println("Podaj miesiąc pierwszej rejestracji...");
            int miesiacRejestracji = scanner.nextInt();
            System.out.println("Podaj dzień pierwszej rejestracji");
            int dzienRejestracji = scanner.nextInt();
            Date dataRejestracji = new Date(rokRejestracji, miesiacRejestracji, dzienRejestracji);
            System.out.println("Podaj cenę sprzedaży...");
            int cena = scanner.nextInt();
            if(marka == "Ford"){
                System.out.println("Czy samochód ma klimatyzację?\n1) Tak\n2) Nie");
                wybor = scanner.next().charAt(0);
                boolean klimatyzacja = true;
                if (wybor == '1'){
                    klimatyzacja = true;
                } else if (wybor == '2'){
                    klimatyzacja = false;
                } else{
                    System.out.println("coś poszło nie tak spróbuj ponownie");
                }
                System.out.println("Podaj srednie spalanie auta na 100km");
                double srednieSpalanie = scanner.nextDouble();
                System.out.println("Czy auto ma fabryczne czy inne radio?\n1) Fabryczne\n2) Inne");
                boolean radio = true;
                wybor = scanner.next().charAt(0);
                if (wybor == '1'){
                    radio = true;
                } else if (wybor == '2'){
                    radio = false;
                } else{
                    System.out.println("coś poszło nie tak spróbuj ponownie");
                }
                System.out.println(String.format("Potwierdź wprowadzone dane wybierając 1\n anuluj wybierając 0\n" +
                        "marka samochodu %s model %s, kolor: %s, typ nadwozia: %s\n rodzaj silnika %s" +
                        "pojemnosc silnika %s, data produkcji %s, przebieg %s, data pierwszej rejestracji %s,|n" +
                        "cena %s, czy ma klimatyzację &s, jakie jest średnie spalanie %s, czy ma fabryczne radio %s\n" +
                        "", marka, model, kolor, nadwozie, silnik, pojemnosc, dataProdukcji, przebieg, dataRejestracji,cena, klimatyzacja, srednieSpalanie, radio ));
                if(scanner.nextInt() == 1){
                    Samochod Ford = new Ford(kolor,nadwozie,silnik,pojemnosc,dataProdukcji,przebieg,dataRejestracji,cena,model,klimatyzacja,srednieSpalanie,radio);
                    listaSamochodow.add(Ford);
                }

            } else if (marka == "Opel"){
                System.out.println("Czy ten opel ma ABS?\n1) tak\n2) nie");
                boolean czyMaAbs = true;
                wybor = scanner.next().charAt(0);
                if (wybor == '1'){
                    czyMaAbs = true;
                } else if (wybor == '2'){
                    czyMaAbs = false;
                } else{
                    System.out.println("coś poszło nie tak spróbuj ponownie");
                }
                System.out.println("Teraz zajmiemy się datą ubezpieczenia:\nPodaj rok produkcji");
                int rokUbezpieczenia = scanner.nextInt();
                System.out.println("Podaj miesiac ubezpieczenia 1 - styczneń, 2 - luty...itp.");
                int miesiacUbezpieczenia = scanner.nextInt();
                System.out.println("a teraz dzień ubezpieczenia...");
                int dzienUbezpieczenia = scanner.nextInt();
                Date dataUbezpieczenia = new Date(rokUbezpieczenia, miesiacUbezpieczenia,dzienUbezpieczenia);
                System.out.println("Wprowadź datę przeglądu...\nPodaj rok");
                int rokPrzegladu = scanner.nextInt();
                System.out.println("Podaj miesiąc przeglądu...");
                int miesiacPrzegladu = scanner.nextInt();
                System.out.println("Podaj dzień przeglądu");
                int dzienPrzegadu = scanner.nextInt();
                Date dataPrzegladu = new Date(rokPrzegladu,miesiacPrzegladu,dzienPrzegadu);
                System.out.println("Podaj pojemnosc bagażnika w dm^3");
                double pojemnoscBagaznika = scanner.nextDouble();

                System.out.println(String.format("Potwierdź wprowadzone dane wybierając 1\n anuluj wybierając 0\n" +
                        "marka samochodu %s model %s, kolor: %s, typ nadwozia: %s\n rodzaj silnika %s" +
                        "pojemnosc silnika %s, data produkcji %s, przebieg %s, data pierwszej rejestracji %s,|n" +
                        "cena %s, auto posiada ABS, %s, data ubezpieczenia, %s, data przeglądu, 5s, pojemnosc bagażnika %s"
                        ,marka, model, kolor, nadwozie, silnik, pojemnosc, dataProdukcji, przebieg, dataRejestracji,cena, czyMaAbs, dataUbezpieczenia, dataPrzegladu, pojemnoscBagaznika ));
                if(scanner.nextInt() == 1){
                    Samochod Opel = new Opel(kolor,nadwozie,silnik,pojemnosc,dataProdukcji,przebieg,dataRejestracji,cena,model,czyMaAbs,dataUbezpieczenia,dataPrzegladu, pojemnoscBagaznika);
                    listaSamochodow.add(Opel);
                }
            }


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
