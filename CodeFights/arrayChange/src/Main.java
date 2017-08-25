/**
 * Created by Paweł on 2017-08-25.
 */

//You are given an array of integers.
//On each move you are allowed to increase exactly one of its element
//by one. Find the minimal number of moves required to
//obtain a strictly increasing sequence from the input.
public class Main {
    public static void main(String... args){
        int[] array = {1,1,1};
        System.out.println(arrayChange(array));
    }
    static int arrayChange(int[] inputArray) {
        int count = 0;
        for (int i = 1; i <inputArray.length ; i++) {
            if(inputArray[i] <= inputArray[i-1]) {
                count++;
                inputArray[i]++;
                i= i-1;
            }

        }
        return count;
    }
}
