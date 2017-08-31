import java.util.Date;

/**
 * Created by Paweł on 2017-08-31.
 */
public class Ford extends Samochod {
    private String model;
    private boolean czyKlimatyzacja;
    private double srednieSpalanie;
    private boolean czyFabryczneRadio;

    public Ford(Enum<Kolory> kolorSamochodu, Enum<Typ_Nadwozia> typNadwozia, Enum<Rodzaj_Silnika> rodzajSilnika, int pojemnoscSilnika, Date dataProdukcji, long przebieg, Date dataPierwszejRejestracji,
                int cena, String model, boolean czyKlimatyzacja, double srednieSpalanie, boolean czyFabryczneRadio) {
        super(kolorSamochodu, typNadwozia, rodzajSilnika, pojemnoscSilnika, dataProdukcji, przebieg, dataPierwszejRejestracji, cena);
        this.model = model;
        this.czyKlimatyzacja = czyKlimatyzacja;
        this.srednieSpalanie = srednieSpalanie;
        this.czyFabryczneRadio = czyFabryczneRadio;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isCzyKlimatyzacja() {
        return czyKlimatyzacja;
    }

    public void setCzyKlimatyzacja(boolean czyKlimatyzacja) {
        this.czyKlimatyzacja = czyKlimatyzacja;
    }

    public double getSrednieSpalanie() {
        return srednieSpalanie;
    }

    public void setSrednieSpalanie(double srednieSpalanie) {
        this.srednieSpalanie = srednieSpalanie;
    }

    public boolean isCzyFabryczneRadio() {
        return czyFabryczneRadio;
    }

    public void setCzyFabryczneRadio(boolean czyFabryczneRadio) {
        this.czyFabryczneRadio = czyFabryczneRadio;
    }

    @Override
    public String dodatkoweWyposazenie() {
        return isCzyKlimatyzacja() + " " + isCzyFabryczneRadio();
    }
}
