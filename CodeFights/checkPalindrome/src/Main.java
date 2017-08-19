/**
 * Created by Paweł on 2017-08-19.
 */
public class Main {
    public static void main(String[] args) {
        String word = "kajak";
        System.out.println(checkPalindrome(word));
    }

    static boolean checkPalindrome(String inputString) {
        for (int i = 0, j = (inputString.length() - 1); i < inputString.length(); i++, j--) {
            if (inputString.charAt(i) != inputString.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
