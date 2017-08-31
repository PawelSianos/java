import java.util.Date;

/**
 * Created by Paweł on 2017-08-31.
 */
public class Opel extends Samochod{

    String model;
    boolean czyJestAbs;
    Date dataUbezpieczenia;
    Date dataPrzegladu;
    double pojemnoscBagaznika;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isCzyJestAbs() {
        return czyJestAbs;
    }

    public void setCzyJestAbs(boolean czyJestAbs) {
        this.czyJestAbs = czyJestAbs;
    }

    public Date getDataUbezpieczenia() {
        return dataUbezpieczenia;
    }

    public void setDataUbezpieczenia(Date dataUbezpieczenia) {
        this.dataUbezpieczenia = dataUbezpieczenia;
    }

    public Date getDataPrzegladu() {
        return dataPrzegladu;
    }

    public void setDataPrzegladu(Date dataPrzegladu) {
        this.dataPrzegladu = dataPrzegladu;
    }

    public double getPojemnoscBagaznika() {
        return pojemnoscBagaznika;
    }

    public void setPojemnoscBagaznika(double pojemnoscBagaznika) {
        this.pojemnoscBagaznika = pojemnoscBagaznika;
    }

    public Opel(Enum<Kolory> kolorSamochodu, Enum<Typ_Nadwozia> typNadwozia, Enum<Rodzaj_Silnika> rodzajSilnika, int pojemnoscSilnika, Date dataProdukcji,
                long przebieg, Date dataPierwszejRejestracji, int cena, String model, boolean czyJestAbs, Date dataUbezpieczenia, Date dataPrzegladu, double pojemnoscBagaznika) {
        super(kolorSamochodu, typNadwozia, rodzajSilnika, pojemnoscSilnika, dataProdukcji, przebieg, dataPierwszejRejestracji, cena);
        this.model = model;
        this.czyJestAbs = czyJestAbs;
        this.dataUbezpieczenia = dataUbezpieczenia;
        this.dataPrzegladu = dataPrzegladu;
        this.pojemnoscBagaznika = pojemnoscBagaznika;


    }

    @Override
    public String dodatkoweWyposazenie() {
        return isCzyJestAbs() + " " + getPojemnoscBagaznika();
    }
}
