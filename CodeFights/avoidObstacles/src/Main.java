import java.util.Arrays;

/**
 * Created by Paweł on 2017-08-25.
 */

//You are given an array of integers representing coordinates of obstacles situated on a straight line.
//Assume that you are jumping from the point with coordinate 0 to the right.
//You are allowed only to make jumps of the same length represented by some integer.
//Find the minimal length of the jump enough to avoid all the obstacles.

public class Main {
    public static void main(String... args){
        int[] input = {5, 3, 6, 7, 9};
        System.out.println(avoidObstacles(input));
    }
    static int avoidObstacles(int[] inputArray) {
        Arrays.sort(inputArray);
        int mac = inputArray[inputArray.length - 1];
        int[] temp = new int[mac + 1];
        int counter = 0;
        for (int i = 0; i <= temp.length - 1; i++) {
            if (i == inputArray[counter]) {
                temp[i] = inputArray[counter];
                counter++;
            } else
                temp[i] = 0;
        }
        for (int i = 2; ; i++) {
            boolean test = true;
            int adder = 0;
            while (adder <= mac) {
                if (temp[adder] != 0) {
                    test = false;
                    break;
                }
                adder += i;
            }
            if(test) {
                return i;
            }
        }
    }
}
