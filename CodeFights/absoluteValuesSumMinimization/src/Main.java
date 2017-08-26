/**
 * Created by Paweł on 2017-08-26.
 */

//Given a sorted array of integers a,
//find an integer x from a such that the value of
//abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)
//is the smallest possible (here abs denotes the absolute value).
//If there are several possible answers, output the smallest one
public class Main {
    public  static void main(String... args){
        int[] array = {2,4,7};
        System.out.println(absoluteValuesSumMinimization(array));
    }
    static int absoluteValuesSumMinimization(int[] a) {
        int sum = Integer.MAX_VALUE;
        int testSum;
        int score = 0;
        for (int i = 0; i <a.length; i++) {
            testSum = 0;
            for (int j = 0; j <a.length ; j++) {
                testSum += Math.abs(a[j]- a[i]);
            }
            if(testSum < sum){
                sum = testSum;
                score = a[i];
            }
        }
        return score;
    }
}
