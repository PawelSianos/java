/**
 * Created by Paweł on 2017-08-26.
 */

/**Given an array of the numbers of votes given to each of
 * the candidates so far, and an integer k equal to the number
 * of voters who haven't cast their vote yet,
 * find the number of candidates who still have a chance to
 * win the election.

 The winner of the election must secure strictly more votes
 than any other candidate. If two or more candidates receive
 the same (maximum) number of votes, assume there is no winner
 at all.
 */
public class Main {
    public static void main(String... args){
        int[] votes = {2,3,5,2};
        int k = 2;
        System.out.println(electionsWinners(votes, k));

    }
    static int electionsWinners(int[] votes, int k) {
        int max = 0;
        for (int i = 0; i <votes.length ; i++) {
            if(votes[i] > max){
                max = votes[i];
            }
        }
        int coutner = 0;
        int zeroCounter = 0;
        for (int i = 0; i < votes.length; i++) {
            if(votes[i] + k > max){
                coutner++;
            }
            else if(votes[i] == max)
                zeroCounter++;
        }
        if(coutner > 0)
            return coutner;
        else if (zeroCounter == 1)
            return 1;
        else
            return 0;
    }
}
