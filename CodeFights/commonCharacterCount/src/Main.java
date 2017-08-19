/**
 * Created by Paweł on 2017-08-19.
 */

//Given two strings, find the number of common characters between them.

public class Main {
    public static void main(String... args){
        String word1 = "aabcc";
        String word2 = "adcaa";
        System.out.println(commonCharacterCount(word1, word2));
    }
    static int commonCharacterCount(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                if (s2.contains(""+c)) {
                    count++;
                    s2 = s2.replaceFirst(""+c, "");
                    break;
                }
            }
        }
        return count;
    }

}
