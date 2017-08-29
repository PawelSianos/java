/**
 * Created by Paweł on 2017-08-29.
 */

/**
 *  you are asked to square every digit of a number.

 For example, if we run 9119 through the function, 811181 will come out.
 */
public class Main {
    public static void main(String... args){
        int value = 18;
        System.out.println(SquareDigit.squareDigits(value));
    }
}
class SquareDigit {
    public static int squareDigits(int n) {
        StringBuilder builder = new StringBuilder();
        String value = Integer.toString(n);
        for (int i = 0; i < value.length(); i++) {
            int digit = Character.getNumericValue(value.charAt(i));
            builder.append(digit * digit);
        }
        return Integer.parseInt(builder.toString());
    }
}
