/**
 * Created by Paweł on 2017-08-26.
 */

import java.util.ArrayList;

/**
 * CodeMaster has just returned from shopping.
 * He scanned the check of the items he bought and gave the
 * resulting string to Ratiorg to figure out the total number
 * of purchased items. Since Ratiorg is a bot he is definitely
 * going to automate it, so he needs a program that sums up
 * all the numbers which appear in the given input.
 * Help Ratiorg by writing a function that returns the sum
 * of numbers that appear in the given inputString.
 */
public class Main {
    public static void main(String... args){
        System.out.println(sumUpNumbers("2 apples, 12 oranges"));
    }
    static int sumUpNumbers(String inputString) {
        int counter = 0;
        inputString += " ";
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if(Character.isDigit(ch)){
                counter++;
            }else if(counter > 0) {
                lista.add(Integer.parseInt(inputString.substring(i - counter, i)));
                counter = 0;
            }
        }
        int score = 0;
        for(Integer i:lista){
            score += i;
        }
        return score;
    }
}
