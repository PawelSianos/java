/**
 * Created by Paweł on 2017-08-26.
 */

/**
 * Construct a square matrix with a size N × N containing integers
 * from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.
 */
public class Main {
    public static void main(String... args){
        int[][] matrix = spiralNumbers(4);
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] spiralNumbers(int n) {
        int[][] m = new int[n][n];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int currentDirectionIndex = 0;
        int currentRow = 0;
        int currentColumn = 0;
        int currentNum = 1;
        int tmpRow;
        int tmpColumn;
        for (int i = n * n; i > 0; i--) {
            m[currentRow][currentColumn] = currentNum;
            currentNum++;
            if (i > 1) {
                // Determine the next cell
                while (true) {
                    tmpRow = currentRow + directions[currentDirectionIndex][0];
                    tmpColumn = currentColumn + directions[currentDirectionIndex][1];
                    if (tmpRow < 0 || tmpRow >= n || tmpColumn < 0 || tmpColumn >= n ||
                            m[tmpRow][tmpColumn] != 0) {
                        currentDirectionIndex = (currentDirectionIndex + 1) % 4;
                    } else {
                        currentRow = tmpRow;
                        currentColumn = tmpColumn;
                        break;
                    }
                }
            }
        }
        return m;
    }
}
