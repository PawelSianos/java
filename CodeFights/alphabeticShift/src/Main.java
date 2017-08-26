/**
 * Created by Paweł on 2017-08-26.
 */

//Given a string, replace each its character by the next
//one in the English alphabet (z would be replaced by a).
public class Main {
    public static void main(String... args){
        String word = "word";
        System.out.println(alphabeticShift(word));

    }
    static String alphabeticShift(String inputString) {
        StringBuilder builder = new StringBuilder();
        int codePoint;
        for (int i = 0; i <inputString.length() ; i++) {
            if(inputString.charAt(i) == 'z')
                builder.append('a');
            else {
                codePoint = ((int) inputString.charAt(i))+1;
                builder.append((char) codePoint);
            }
        }
        return builder.toString();
    }
}
