/**
 * Created by Paweł on 2017-08-25.
 */

//Given an array of integers, replace all
//the occurrences of elemToReplace with substitutionElem.
public class Main {
    public static void main(String... args){
        int[] array = {1,2,3,4};
        int elementToReplace = 2;
        int elementInstead = 6;
        int[] result = arrayReplace(array, elementToReplace, elementInstead);
        for(int e: result){
            System.out.print(e);
        }
    }
    static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int i = 0; i <inputArray.length; i++) {
            if (inputArray[i] == elemToReplace)
                inputArray[i] = substitutionElem;
        }
        return inputArray;
    }

}
