/**
 * Created by Paweł on 2017-08-26.
 */

/**
 Given a string, find the shortest possible string which can
 be achieved by adding characters
 to the end of initial string to make it a palindrome.
 */
public class Main {
    public static void main(String... args){
        System.out.println(buildPalindrome("kot"));
    }
    static String buildPalindrome(String st) {
        String palidrome = st;
        StringBuilder builder = new StringBuilder(palidrome);
        int i = 0;
        while (!checkingPalidrome(palidrome)){
            builder.insert((palidrome.length()-i),st.charAt(i));
            i++;
            palidrome = builder.toString();
        }
        return palidrome;
    }
    static boolean checkingPalidrome(String s){
        for (int i = 0, j = s.length()-1; i < j; i++, j--) {
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
