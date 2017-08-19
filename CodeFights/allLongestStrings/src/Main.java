/**
 * Created by Paweł on 2017-08-19.
 */
//Given an array of strings, return another array containing all of its longest strings.

public class Main {
    public static void main(String... args){
        String[] array = {"aba", "aa", "ad", "vcd", "aba"};
        String[] result = allLongestStrings(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    static String[] allLongestStrings(String[] inputArray) {
        int score = 0;
        int sum = 0;
        for (int i  = 0; i < inputArray.length; i++) {
            if (score < inputArray[i].length()) {
                score = inputArray[i].length();
                sum = 1;
            }
            else if(score == inputArray[i].length())
                sum++;
        }
        String[] result = new String[sum];
        int j = 0;
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i].length() == score)
                result[j++] = inputArray[i];
        }
        return result;
    }

}
