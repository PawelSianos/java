/**
 * Created by Paweł on 2017-08-19.
 */
public class Main {
    public static void main(String... args){
        int year = 1123;
        System.out.println(centuryFromYear(year));
    }
    static int centuryFromYear(int year) {
        int century = year/100;
        if(year%100 !=0)
            century++;
        return century;
    }
}
