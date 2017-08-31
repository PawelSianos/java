import java.util.Date;

/**
 * Created by Paweł on 2017-08-31.
 */
public abstract class Samochod {
    private Enum<Kolory> kolorSamochodu;
    private Enum<Typ_Nadwozia> typNadwozia;
    private Enum<Rodzaj_Silnika> rodzajSilnika;
    private int pojemnoscSilnika;
    private Date dataProdukcji;
    private long przebieg;
    private Date dataPierwszejRejestracji;
    private int cena;

    public Samochod(Enum<Kolory> kolorSamochodu, Enum<Typ_Nadwozia> typNadwozia, Enum<Rodzaj_Silnika> rodzajSilnika,
                    int pojemnoscSilnika, Date dataProdukcji, long przebieg, Date dataPierwszejRejestracji, int cena) {
        this.kolorSamochodu = kolorSamochodu;
        this.typNadwozia = typNadwozia;
        this.rodzajSilnika = rodzajSilnika;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.dataProdukcji = dataProdukcji;
        this.przebieg = przebieg;
        this.dataPierwszejRejestracji = dataPierwszejRejestracji;
        this.cena = cena;
    }

    public Enum<Kolory> getKolorSamochodu() {
        return kolorSamochodu;
    }

    public void setKolorSamochodu(Enum<Kolory> kolorSamochodu) {
        this.kolorSamochodu = kolorSamochodu;
    }

    public Enum<Typ_Nadwozia> getTypNadwozia() {
        return typNadwozia;
    }

    public void setTypNadwozia(Enum<Typ_Nadwozia> typNadwozia) {
        this.typNadwozia = typNadwozia;
    }

    public Enum<Rodzaj_Silnika> getRodzajSilnika() {
        return rodzajSilnika;
    }

    public void setRodzajSilnika(Enum<Rodzaj_Silnika> rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }

    public int getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(int pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public Date getDataProdukcji() {
        return dataProdukcji;
    }

    public void setDataProdukcji(Date dataProdukcji) {
        this.dataProdukcji = dataProdukcji;
    }

    public long getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(long przebieg) {
        this.przebieg = przebieg;
    }

    public Date getDataPierwszejRejestracji() {
        return dataPierwszejRejestracji;
    }

    public void setDataPierwszejRejestracji(Date dataPierwszejRejestracji) {
        this.dataPierwszejRejestracji = dataPierwszejRejestracji;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public abstract String dodatkoweWyposazenie();

    public double sredniaPrzejechanychKm(String dataProdukcji, int przebieg){
        Date data = new Date();
        int iloscLat = data.getYear() - getDataProdukcji().getYear();
        return getPrzebieg()/ iloscLat;
    }
}
