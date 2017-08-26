/**
 * Created by Paweł on 2017-08-26.
 */

//Let's define digit degree of some positive integer as the
//number of times we need to replace this number with
//the sum of its digits until we get to a one digit number.
//Given an integer, find its digit degree.

public class Main {
    public static void main(String... args){
        int n = 55;
        System.out.println(digitDegree(n));
    }
    static int digitDegree(int n) {
        if(n < 10)
            return 0;
        int temp = adder(n);
        int counter = 1;
        while (temp >= 10){
            temp = adder(temp);
            counter++;
        }
        return counter;
    }
    static int adder (int n){
        int sum = 0;
        while(n>0) {
            sum += n%10;
            n/=10;}
        return sum;
    }
}
