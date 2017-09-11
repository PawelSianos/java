/**
 * Created by Paweł on 2017-09-11.
 */
public class Hotele extends CiekaweMiejsca {
    private int iloscGwiazdek;
    private int iloscPokoi;
    private boolean czyWolnyPokoj;

    public int getIloscGwiazdek() {
        return iloscGwiazdek;
    }

    public void setIloscGwiazdek(int iloscGwiazdek) {
        this.iloscGwiazdek = iloscGwiazdek;
    }

    public int getIloscPokoi() {
        return iloscPokoi;
    }

    public void setIloscPokoi(int iloscPokoi) {
        this.iloscPokoi = iloscPokoi;
    }

    public boolean isCzyWolnyPokoj() {
        return czyWolnyPokoj;
    }

    public void setCzyWolnyPokoj(boolean czyWolnyPokoj) {
        this.czyWolnyPokoj = czyWolnyPokoj;
    }
}
