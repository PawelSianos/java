/**
 * Created by Paweł on 2017-09-11.
 */
public class Restauracja extends CiekaweMiejsca {
    private String rodzajKuchni;
    private String iloscMiejsc;
    private String godzOtwarcia;

    public String getRodzajKuchni() {
        return rodzajKuchni;
    }

    public void setRodzajKuchni(String rodzajKuchni) {
        this.rodzajKuchni = rodzajKuchni;
    }

    public String getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(String iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public String getGodzOtwarcia() {
        return godzOtwarcia;
    }

    public void setGodzOtwarcia(String godzOtwarcia) {
        this.godzOtwarcia = godzOtwarcia;
    }
}
