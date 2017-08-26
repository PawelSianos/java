/**
 * Created by Paweł on 2017-08-26.
 */

//Correct variable names consist only of Latin letters,
//digits and underscores and they can't start
//with a digit.
//Check if the given string is a correct variable name.
public class Main {
    public static void main(String ... args){
        String s = "QWE_1";
        System.out.println(variableName(s));
    }
    static boolean variableName(String name) {
        for(char ch : name.toCharArray()){
            if(!Character.isDigit(ch) && !Character.isLetter(ch) && ch != '_')
                return false;
        }
        return !Character.isDigit(name.charAt(0));
    }
}
