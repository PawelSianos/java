/**
 * Created by Paweł on 2017-08-26.
 */

import java.util.HashSet;
import java.util.Set;

/**
 * Given a rectangular matrix containing only digits,
 * calculate the number of different 2 × 2 squares in it.
 */
public class Main {
    public static void main(String... args){
        int[][] matrix = {{1,2,1},{2,2,2},{2,2,2},{1,2,3},{2,2,1}};
        System.out.println(differentSquares(matrix));
    }
    static int differentSquares(int[][] matrix) {
        if (matrix.length < 2 || matrix[0].length<2)
            return 0;
        Set<String> secik = new HashSet<>();
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                String part ="" + matrix[i][j]+ matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];
                secik.add(part);
            }
        }
        return secik.size();
    }
}
