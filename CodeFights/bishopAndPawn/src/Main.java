/**
 * Created by Paweł on 2017-08-26.
 */

//Given the positions of a white bishop and a black pawn on
//the standard chess board, determine
//whether the bishop can capture the pawn in one move.
public class Main {
    public static void main(String... args){
        String bishop = "a1";
        String pawn = "d4";
        System.out.println(bishopAndPawn(bishop, pawn));
    }
    static boolean bishopAndPawn(String bishop, String pawn) {
        int bLetter = (int) bishop.charAt(0);
        int bDigit = (int) bishop.charAt(1);
        int pLetter = (int) pawn.charAt(0);
        int pDigit = (int) pawn.charAt(1);
        if(Math.abs(bLetter - pLetter)== Math.abs(bDigit - pDigit))
            return true;
        else
            return false;
    }
}
