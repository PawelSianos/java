/**
 * Created by Paweł on 2017-08-26.
 */

//Given array of integers, find the maximal possible sum of some of its k consecutive elements.

public class Main {
    public static void main(String... args){
        int[] array = {4,56,8,12,55,65,23,1,6,77,45,77};
        int k = 3;
        System.out.println(arrayMaxConsecutiveSum(array, k));
    }
    static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < inputArray.length - (k - 1); i++) {
            if (i == 0) {
                for (int j = 0; j < k; j++) {
                    sum += inputArray[j];
                }
            }
            else{
                sum = sum - inputArray[i - 1];
                sum = sum + inputArray[i + (k-1)];
            }
            if (sum > max)
                max = sum;
        }
        return max;

    }
}
