/**
 * Created by Paweł on 2017-08-20.
 */
//Several people are standing in a row and need to be divided into two teams. The first person goes into team 1,
//the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.
//
//You are given an array of positive integers - the weights of the people.
//Return an array of two integers, where the first element is the total weight of team 1,
//and the second element is the total weight of team 2 after the division is complete.
public class Main {
    public static void main(String... args) {
        int[] a = {50, 60, 70, 60, 60};
        int[] result = alternatingSums(a);
        for(int i: result){
            System.out.println(i);
        }
    }

    static int[] alternatingSums(int[] a) {
        int[] sum = new int[]{0, 0};
        for (int i = 0; i < a.length; i++) {
            boolean isOdd = (i % 2 == 0);
            if (!isOdd) {
                sum[1] += a[i];
            } else {
                sum[0] += a[i];
            }
        }
        return sum;
    }
}
