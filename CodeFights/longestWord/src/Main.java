/**
 * Created by Paweł on 2017-08-26.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Define a word as a sequence of consecutive English letters.
 * Find the longest word from the given string.
 */
public class Main {
    public static void main(String... args){
        System.out.println(longestWord("Ready, steady, go!"));
    }
    static String longestWord(String text) {
        String word = text + " ";
        int longest = 0;
        String longestWord = "";
        List<String> lista = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < word.length(); i++) {
            char sign = word.charAt(i);
            if (Character.isLetter(sign)) {
                start++;
            } else if (start > 0) {
                lista.add(word.substring(i - start, i));
                start = 0;
            }
        }
        for (String elem : lista) {
            if(elem.length() > longest) {
                longest = elem.length();
                longestWord = elem;
            }
        }
        return longestWord;
    }
}
