import java.util.Arrays;

/**
 * Created by Paweł on 2017-08-20.
 */
public class Main {
    public static void main(String... args){
        int[] array = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] anserw = sortByHeight(array);
        for(int  elem: anserw){
            System.out.println(elem);
        }
    }
    static int[] sortByHeight(int[] a) {
        int count = 0;
        for(int element: a){
            if (element != -1)
                count++;
        }
        int[] temp = new int[count];
        int value = 0;
        for(int element: a){
            if (element != -1){
                temp[value] = element;
                value++;
            }
        }
        value = 0;
        Arrays.sort(temp);

        for (int i = 0; i <a.length ; i++) {
            if(a[i] != -1){
                a[i] = temp[value];
                value++;
            }
        }
        return a;
    }
}
