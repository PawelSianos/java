/**
 * Created by Paweł on 2017-08-25.
 */

//In the popular Minesweeper game you have a board with some mines
//and those cells that don't contain a mine have a number in it that indicates
//the total number of mines in the neighboring cells.
//Starting off with some arrangement of mines we want to create a Minesweeper game setup.
public class Main {
    public static void main(String... args){
        boolean[][] array = {{true, false, false},{false, true, false},{false, false, false}};
        int[][] result = minesweeper(array);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] minesweeper(boolean[][] matrix) {
        int[][] temp = new int[matrix.length + 2][matrix[0].length + 2];
        for (int i = 1; i <temp.length-1 ; i++) {
            for (int j = 1; j <temp[0].length-1 ; j++) {
                if(matrix[i-1][j-1]){
                    temp[i-1][j-1] += 1;
                    temp[i-1][j] += 1;
                    temp[i-1][j+1] += 1;
                    temp[i][j-1] += 1;
                    temp[i][j+1] += 1;
                    temp[i+1][j-1] += 1;
                    temp[i+1][j] += 1;
                    temp[i+1][j+1] += 1;
                }
            }

        }
        int[][] score = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[0].length ; j++) {
                score[i][j] = temp[i+1][j+1];
            }

        }
        return score;

    }
}
