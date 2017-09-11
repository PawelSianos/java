/**
 * Created by Paweł on 2017-09-11.
 */
public class AtrakcjeTurystyczne extends CiekaweMiejsca {
    private String typMiejsca;
    private double cenaWstepu;
    private String godzOtwarcia;

    public String getTypMiejsca() {
        return typMiejsca;
    }

    public void setTypMiejsca(String typMiejsca) {
        this.typMiejsca = typMiejsca;
    }

    public double getCenaWstepu() {
        return cenaWstepu;
    }

    public void setCenaWstepu(double cenaWstepu) {
        this.cenaWstepu = cenaWstepu;
    }

    public String getGodzOtwarcia() {
        return godzOtwarcia;
    }

    public void setGodzOtwarcia(String godzOtwarcia) {
        this.godzOtwarcia = godzOtwarcia;
    }
}
