/**
 * Created by Paweł on 2017-08-25.
 */

//Call two arms equally strong if the heaviest weights they each are able to lift are equal.
//Call two people equally strong if their strongest arms are equally strong
//(the strongest arm can be both the right and the left), and so are their weakest arms.
//Given your and your friend's arms' lifting capabilities find out if you two are equally strong.
public class Main {
    public static void main(String... args){
        int yourLeft = 10;
        int yourRight = 15;
        int frendsLeft = 15;
        int frendsRight = 10;
        System.out.println(areEquallyStrong(yourLeft, yourRight, frendsLeft, frendsRight));
    }
    static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        if ((yourLeft == friendsLeft && yourRight == friendsRight)||(yourLeft == friendsRight&& yourRight== friendsLeft))
            return true;
        else
            return false;
    }
}
