/**
 * Created by Paweł on 2017-09-11.
 */
public abstract class CiekaweMiejsca extends Lokalizacja {
    private double ocenaKlientow;
    private String nazwaMiejsca;

    public double getOcenaKlientow() {
        return ocenaKlientow;
    }

    public void setOcenaKlientow(double ocenaKlientow) {
        this.ocenaKlientow = ocenaKlientow;
    }

    public String getNazwaMiejsca() {
        return nazwaMiejsca;
    }

    public void setNazwaMiejsca(String nazwaMiejsca) {
        this.nazwaMiejsca = nazwaMiejsca;
    }
}
