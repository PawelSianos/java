/**
 * Created by Paweł on 2017-08-26.
 */

//Given two cells on the standard chess board,
//determine whether they have the same color or not.

public class Main {
    public static void main(String... args){
        String s1 = "A1";
        String s2 = "C3";
        System.out.println(chessBoardCellColor(s1, s2));
    }
    static boolean chessBoardCellColor(String cell1, String cell2) {
        int numer1 = ((int) cell1.charAt(0))+(int) cell1.charAt(1);
        int numer2 = ((int) cell2.charAt(0))+(int) cell2.charAt(1);
        if(numer1%2 == 0 && numer2%2 == 0)
            return true;
        else if(numer1%2 != 0 && numer2%2 != 0)
            return true;
        else
            return false;
    }
}
