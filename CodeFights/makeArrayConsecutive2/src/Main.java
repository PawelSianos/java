/**
 * Created by Paweł on 2017-08-19.
 */
// Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
// each statue having an non-negative integer size. Since he likes to make things perfect,
// he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1.
// He may need some additional statues to be able to accomplish that.
// Help him figure out the minimum number of additional statues needed.

//    For statues = [6, 2, 3, 8], the output should be
//    makeArrayConsecutive2(statues) = 3.
//    Ratiorg needs statues of sizes 4, 5 and 7.

public class Main {
    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        System.out.println(makeArrayConsecutive2(statues));
    }

    static int makeArrayConsecutive2(int[] statues) {
        int arrMax = statues[0];
        int arrMin = statues[0];

        for (int i = 1; i < statues.length; i++) {
            if (statues[i] > arrMax)
                arrMax = statues[i];
            if (statues[i] < arrMin)
                arrMin = statues[i];
        }
        int score = (arrMax - arrMin) - (statues.length) + 1;
        return score;
    }

}
