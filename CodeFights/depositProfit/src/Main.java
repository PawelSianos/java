/**
 * Created by Paweł on 2017-08-26.
 */

//You have deposited a specific amount of dollars into your
//bank account. Each year your balance increases at the
//same growth rate. Find out how long it would take for
//your balance to pass a specific threshold with the assumption
//that you don't make any additional deposits
public class Main {
    public static void main(String... args){
        int deposit = 100;
        int rate = 20;
        int theshold = 170;
        System.out.println(depositProfit(deposit, rate, theshold));
    }
    static int depositProfit(int deposit, int rate, int threshold) {
        double result = deposit;
        int score = 0;
        while(result < threshold){
            result += ((result/100) * rate);
            score++;
        }
        return score;
    }

}
