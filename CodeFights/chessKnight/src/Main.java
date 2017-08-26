/**
 * Created by Paweł on 2017-08-26.
 */

/**
 Given a position of a knight on the standard chessboard, find
 the number of different moves the knight can perform.

 The knight can move to a square that is two squares horizontally
 and one square vertically, or two squares vertically and one
 square horizontally away from it. The complete move therefore
 looks like the letter L. Check out the image below to see all
 valid moves for a knight piece that
 is placed on one of the central squares.
 */
public class Main {
    public static void main(String... args){
        System.out.println(chessKnight("c3"));
    }
    static int chessKnight(String cell) {
        int result = 0;
        int letter = ((int) Character.valueOf(cell.charAt(0))-96);
        int number = Character.getNumericValue(cell.charAt(1));
        if(letter-2>0&&number+1<9)
            result++;
        if(letter-2>0&&number-1>0)
            result++;
        if(letter-1>0&&number+2<9)
            result++;
        if(letter-1>0&&number-2>0)
            result++;
        if(letter+2<9&&number+1<9)
            result++;
        if(letter+2<9&&number-1>0)
            result++;
        if(letter+1<9&&number+2<9)
            result++;
        if(letter+1<9&&number-2>0)
            result++;
        return result;
    }
}
