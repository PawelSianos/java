/**
 * Created by Paweł on 2017-09-11.
 */
public abstract class Lokalizacja {
    private String nazwaMiejscowosci;
    private double polozenieSzerokosc;
    private double polozenieDlugosc;

    public String getNazwaMiejscowosci() {
        return nazwaMiejscowosci;
    }

    public void setNazwaMiejscowosci(String nazwaMiejscowosci) {
        this.nazwaMiejscowosci = nazwaMiejscowosci;
    }

    public double getPolozenieSzerokosc() {
        return polozenieSzerokosc;
    }

    public void setPolozenieSzerokosc(double polozenieSzerokosc) {
        this.polozenieSzerokosc = polozenieSzerokosc;
    }

    public double getPolozenieDlugosc() {
        return polozenieDlugosc;
    }

    public void setPolozenieDlugosc(double polozenieDlugosc) {
        this.polozenieDlugosc = polozenieDlugosc;
    }
}
