import java.util.Arrays;

/**
 * Created by Paweł on 2017-08-25.
 */

//Given a string, find out if its characters can be
//        rearranged to form a palindrome.
public class Main {
    public static void main(String... args){
        String inputString = "aannbb";
        System.out.println(palindromeRearranging(inputString));
    }
    static boolean palindromeRearranging(String inputString) {
        int stringLength = inputString.length();
        int sum = 0;
        if (stringLength == 1)
            return true;
        char[] tempArray = new char[stringLength];
        for (int i = 0; i <stringLength ; i++) {
            tempArray[i] = inputString.charAt(i);
        }
        Arrays.sort(tempArray);
        if(stringLength %2 == 0){
            for (int i = 0; i < stringLength - 1; i=i+2) {
                if (tempArray[i] != tempArray[i+1])
                    return false;
            }
        }else{
            for (int i = 0; i < stringLength-1; i=i+2) {
                if(tempArray[i] != tempArray[i+1]){
                    sum++;
                    i--;
                }
            }
            return sum< 2 ? true: false;
        }
        return  true;
    }
}
