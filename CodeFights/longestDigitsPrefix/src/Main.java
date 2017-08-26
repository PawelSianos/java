/**
 * Created by Paweł on 2017-08-26.
 */

//Given a string, output its longest prefix which contains only digits.
public class Main {
    public static void main(String... args){
        String word = "1244Afljkagn4555555vv";
        System.out.println(longestDigitsPrefix(word));
    }
    static String longestDigitsPrefix(String inputString) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i < inputString.length(); i++){
            if(Character.isDigit(inputString.charAt(i))){
                builder.append(inputString.charAt(i));
            }
            else
                break;
        }
        return builder.toString();
    }
}
