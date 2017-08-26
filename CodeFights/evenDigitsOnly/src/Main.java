/**
 * Created by Paweł on 2017-08-26.
 */
//Check if all digits of the given integer are even.
public class Main {
    public static void main(String... args){
        int n = 11;
        System.out.println(evenDigitsOnly(n));
    }
    static boolean evenDigitsOnly(int n) {
        String str = String.valueOf(n);
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)%2 != 0)
                return false;
        }
        return true;
    }
}
