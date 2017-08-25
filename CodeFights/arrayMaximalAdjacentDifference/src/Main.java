/**
 * Created by Paweł on 2017-08-25.
 */

//Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.
public class Main {
    public static void main(String... args){
        int[] inputArray = { 2, 4, 1, 0};
        System.out.println(arrayMaximalAdjacentDifference(inputArray));
    }
    static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int max = 0;
        int difference;
        int size = inputArray.length;

        for (int i = 0; i < size -1; i++ ){
            difference = (inputArray[i]  >= inputArray[i+1])?
                    inputArray[i]-inputArray[i+1]:
                    inputArray[i+1]-inputArray[i];
            if(max < difference)
                max = difference;
        }
        if(max < 0)
            max = -max;
        return max;
    }
}
