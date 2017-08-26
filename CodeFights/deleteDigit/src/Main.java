/**
 * Created by Paweł on 2017-08-26.
 */

/**
 * Given some integer, find the maximal number you can
 * obtain by deleting exactly one digit of the given number.
 */
public class Main {
    public static void main(String... args){
        System.out.println(deleteDigit(1234));
    }
    static int deleteDigit(int n) {
        int maximalValue = 0;
        String value = Integer.toString(n);
        for (int i = 0; i < value.length(); i++) {
            if(maximalValue < Integer.valueOf(value.substring(0,i)+ value.substring(i+1)))
                maximalValue = Integer.valueOf(value.substring(0,i)+ value.substring(i+1));
        }
        return maximalValue;
    }
}
