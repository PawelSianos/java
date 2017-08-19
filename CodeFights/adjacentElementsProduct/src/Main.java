/**
 * Created by Paweł on 2017-08-19.
 */
public class Main {
    public static void main(String... args){
        int[] array = {3, 6, -2, -5, 7, 3};
        System.out.println(adjacentElementsProduct(array));

    }
    static int adjacentElementsProduct(int[] inputArray) {
        int score = inputArray[0]* inputArray[1];
        for(int i = 1; i < (inputArray.length-1); i++)
        {
            if ((inputArray[i] * inputArray[i+1] > score))
                score = (inputArray[i] * inputArray[i+1]);
        }
        return score;
    }
}
