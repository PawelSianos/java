/**
 * Created by Paweł on 2017-08-26.
 */

/**
 A media access control address (MAC address) is a unique
 identifier assigned to network
 interfaces for communications on the physical network segment.

 The standard (IEEE 802) format for printing MAC-48 addresses
 in human-friendly form is six groups of two hexadecimal
 digits (0 to 9 or A to F), separated by hyphens (e.g. 01-23-45-67-89-AB).

 Your task is to check by given string inputString whether it
 corresponds to MAC-48 address or not.
 */
public class Main {
    public static void main(String... args){
        System.out.println(isMAC48Address("01-23-45-67-89-AB"));
    }
    static boolean isMAC48Address(String inputString) {
        if (inputString.length() != 17)
            return false;
        inputString = inputString + "-";
        for (int i = 0; i < inputString.length(); i = i+3) {
            int score = (int) inputString.charAt(i);
            int score2 = (int) inputString.charAt(i+1);
            if(!(Character.isDigit(inputString.charAt(i)) || score > 64 && score < 71) )
                return false;
            if(!(Character.isDigit(inputString.charAt(i+1)) || score2 > 64 && score2 < 71))
                return false;
            if(inputString.charAt(i+2) != '-')
                return false;
        }
        return true;
    }
}
