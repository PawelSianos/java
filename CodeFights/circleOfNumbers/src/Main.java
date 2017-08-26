/**
 * Created by Paweł on 2017-08-26.
 */

//Consider integer numbers from 0 to n - 1 written down along
//the circle in such a way that the distance
//between any two neighbouring numbers is equal
//(note that 0 and n - 1 are neighbouring, too).
//Given n and firstNumber, find the number which is
//written in the radially opposite position to firstNumber.
public class Main {
    public static void main(String... args){
        int n = 10;
        int start = 2;
        System.out.println(circleOfNumbers(n, start));
    }
    static int circleOfNumbers(int n, int firstNumber) {
        int score =(n/2) + firstNumber;
        if(score >= n)
            return score - n;
        else
            return score;
    }
}
