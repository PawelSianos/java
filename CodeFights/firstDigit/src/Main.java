/**
 * Created by Paweł on 2017-08-26.
 */

//Find the leftmost digit that occurs in a given string.

public class Main {
    public static void main(String... args){
        String input = "fwe1fgab90";
        System.out.println(firstDigit(input));
    }
    static char firstDigit(String inputString) {
        for(int i = 0; i < inputString.length(); i++){
            if(Character.isDigit(inputString.charAt(i)))
                return inputString.charAt(i);
        }
        return 0;
    }

}
