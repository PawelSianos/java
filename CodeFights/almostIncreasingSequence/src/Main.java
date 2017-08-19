/**
 * Created by Paweł on 2017-08-19.
 */
//Given a sequence of integers as an array,
//determine whether it is possible to obtain a strictly increasing sequence
//by removing no more than one element from the array.

//For sequence = [1, 3, 2, 1], the output should be
//almostIncreasingSequence(sequence) = false;
//There is no one element in this array that can be removed in order to get a strictly increasing sequence.

//For sequence = [1, 3, 2], the output should be
//almostIncreasingSequence(sequence) = true.
//You can remove 3 from the array to get the strictly increasing sequence [1, 2].
//Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

public class Main {
    public static void main(String... args) {
        int[] seq = {1, 3, 2, 1};
        System.out.println(almostIncreasingSequence(seq));
    }

    static boolean almostIncreasingSequence(int[] sequence) {
        int score = 0;
        int max = sequence[0];
        int secmax = -2147483648;
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] > max) {
                secmax = max;
                max = sequence[i];
            } else if (sequence[i] > secmax) {
                max = sequence[i];
                score++;
            } else
                score++;
        }
        return score < 2;
    }

}
