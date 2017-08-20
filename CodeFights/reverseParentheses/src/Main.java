/**
 * Created by Paweł on 2017-08-20.
 */
//You have a string s that consists of English letters, punctuation marks, whitespace characters, and brackets.
//It is guaranteed that the parentheses in s form a regular bracket sequence.
//Your task is to reverse the strings contained in each pair of matching parentheses, starting from the innermost pair.
//The results string should not contain any parentheses.
public class Main {
    public static void main(String... args){
        String word = "The ((quick (brown) (fox) jumps over the lazy) dog)";
        System.out.println(reverseParentheses(word));
    }
    private static String reverseParentheses(String s){
        StringBuilder reversed = new StringBuilder(s);
        String fragment;
        String preFragment;
        String postFragment;
        String text = "";
        int braches = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) ==('(')){
                braches++;
            }
        }
        for (int i = 0; i < braches ; i++) {
            fragment = reversed.substring(s.lastIndexOf('('), (s.indexOf(')', s.lastIndexOf('(')) + 1));
            preFragment = reversed.substring(0, (s.lastIndexOf('(')));
            postFragment = reversed.substring((s.indexOf(')', s.lastIndexOf('(')) + 1));
            for (int j = fragment.length() - 2; j > 0; j--) {
                text += fragment.charAt(j);
            }
            reversed = reversed.delete(0, reversed.length())
                    .append(preFragment)
                    .append(text)
                    .append(postFragment);
            s = reversed.toString();
            text = "";
        }
        return reversed.toString();
    }

}
