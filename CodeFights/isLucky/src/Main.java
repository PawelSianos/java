/**
 * Created by Paweł on 2017-08-19.
 */
//Ticket numbers usually consist of an even number of digits.
//A ticket number is considered lucky if the sum of the first half
//of the digits is equal to the sum of the second half.
//Given a ticket number n, determine if it's lucky or not.
//Example
//For n = 1230, the output should be
//isLucky(n) = true;
//For n = 239017, the output should be
//isLucky(n) = false.
public class Main {
    public static void main(String... args){
        System.out.println(isLucky(23907));
    }
    static boolean isLucky(int n) {
        String tekst = Integer.toString(n);
        int count  = Integer.toString(n).length();
        int aSum = 0;
        int bSum = 0;
        for (int i = 0; i < count ; i++) {
            if(i < (count/2)){
                aSum += Integer.valueOf(tekst.charAt(i));
            }
            else{
                bSum += Integer.valueOf(tekst.charAt(i));
            }
        }
        if (aSum == bSum)
            return true;
        else
            return false;
    }
}
