/**
 * Created by Paweł on 2017-09-11.
 */
public class Miejscowosc extends Lokalizacja {
    private int liczbaMieszkancow;
    private boolean czyMiasto;

    public int getLiczbaMieszkancow() {
        return liczbaMieszkancow;
    }

    public void setLiczbaMieszkancow(int liczbaMieszkancow) {
        this.liczbaMieszkancow = liczbaMieszkancow;
    }

    public boolean isCzyMiasto() {
        return czyMiasto;
    }

    public void setCzyMiasto(boolean czyMiasto) {
        this.czyMiasto = czyMiasto;
    }
}
