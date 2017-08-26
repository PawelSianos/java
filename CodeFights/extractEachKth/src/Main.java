import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paweł on 2017-08-26.
 */
public class Main {
    public static void main(String... args){
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
        int element = 4;
        int[] result = extractEachKth(array, element);
        for(int r:result){
            System.out.print(r);
        }
    }
    static int[] extractEachKth(int[] inputArray, int k) {
        List<Integer> temp = new ArrayList<>();
        int j = k;
        for(int i = 0; i< inputArray.length; i++){
            if(i +1 !=  j)
                temp.add(inputArray[i]);
            else
                j += k;
            continue;
        }
        int[] newOne = new int[temp.size()];
        for(int i = 0; i < newOne.length; i++){
            newOne[i] = temp.get(i);
        }
        return newOne;
    }
}
