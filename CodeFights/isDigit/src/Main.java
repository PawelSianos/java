/**
 * Created by Paweł on 2017-08-26.
 */

//Determine if the given character is a digit or not.
public class Main {
    public static void main(String... args){
        System.out.println(isDigit('2'));
    }
    static boolean isDigit(char symbol) {
        return Character.isDigit(symbol);
    }
}
