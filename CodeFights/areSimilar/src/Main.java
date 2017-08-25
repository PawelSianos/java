/**
 * Created by Paweł on 2017-08-25.
 */

//Two arrays are called similar if one can be obtained from another
//by swapping at most one pair of elements in one of the arrays.
//Given two arrays a and b, check whether they are similar.
public class Main {
    public static void main(String... args){
        int[] a = {1, 2, 3};
        int[] b = {2, 1, 3};
        System.out.println(areSimilar(a, b));
    }
    static boolean areSimilar(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        int count = 0;
        int tempCount = 0;
        int[] temp = new int[]{0,0,0,0};
        int arraylength = a.length;
        for (int i = 0; i < arraylength ; i++) {
            if(a[i] != b[i]){
                count++;
                if(count > 2)
                    return false;
                temp[tempCount] = a[i];
                temp[tempCount+1] = b[i];
                tempCount = tempCount + 2;
            }
        }
        if(temp[0] == temp[3] && temp[1] == temp[2])
            return true;
        else
            return false;
    }

}
