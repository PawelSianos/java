/**
 * Created by Paweł on 2017-07-31.
 */
public class Main {
    public static void main(String... args) {
        int[] tablica = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int iloscElementow = tablica.length-1;
        rekurencja(tablica, iloscElementow);
    }

    private static void rekurencja(int[] tablica,int iloscElementow) {
        if(iloscElementow >= 0){
            System.out.println(tablica[iloscElementow]);
            iloscElementow--;
            rekurencja(tablica, iloscElementow);
        }
    }
}


