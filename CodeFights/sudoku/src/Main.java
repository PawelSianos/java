/**
 * Created by Paweł on 2017-08-26.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Sudoku is a number-placement puzzle. The objective is to
 * fill a 9 × 9
 * grid with digits so that each column, each row, and each
 * of the nine 3 × 3 sub-grids that compose the grid contains
 * all of the digits from 1 to 9.
 * This algorithm should check if the given grid of numbers
 * represents a correct solution to Sudoku.
 */
public class Main {
    public static void main(String... args){
        int[][] sudoku = {
                {1,2,3,4,5,6,7,8,9},
                {2,3,4,5,6,7,8,9,1},
                {3,4,5,6,7,8,9,1,2},
                {4,5,6,7,8,9,1,2,3},
                {5,6,7,8,9,1,2,3,4},
                {6,7,8,9,1,2,3,4,5},
                {7,8,9,1,2,3,4,5,6},
                {8,9,1,2,3,4,5,6,7},
                {9,1,2,3,4,5,6,7,8}};
        System.out.println(sudoku(sudoku));

    }
    static boolean sudoku(int[][] grid) {
        List<Boolean> anserw = new ArrayList<>();

        anserw.add(checking(0,0,2,2, grid));
        anserw.add(checking(0,3,2,5, grid));
        anserw.add(checking(0,6,2,8, grid));
        anserw.add(checking(3,0,5,2, grid));
        anserw.add(checking(3,3,5,5, grid));
        anserw.add(checking(3,6,5,8, grid));
        anserw.add(checking(6,0,8,2, grid));
        anserw.add(checking(6,3,8,5, grid));
        anserw.add(checking(6,6,8,8, grid));

        anserw.add(checking(0,0,0,8, grid));
        anserw.add(checking(1,0,1,8, grid));
        anserw.add(checking(2,0,2,8, grid));
        anserw.add(checking(3,0,3,8, grid));
        anserw.add(checking(4,0,4,8, grid));
        anserw.add(checking(5,0,5,8, grid));
        anserw.add(checking(6,0,6,8, grid));
        anserw.add(checking(7,0,7,8, grid));
        anserw.add(checking(8,0,8,8, grid));

        anserw.add(checking(0,0,8,0, grid));
        anserw.add(checking(0,1,8,1, grid));
        anserw.add(checking(0,2,8,2, grid));
        anserw.add(checking(0,3,8,3, grid));
        anserw.add(checking(0,4,8,4, grid));
        anserw.add(checking(0,5,8,5, grid));
        anserw.add(checking(0,6,8,6, grid));
        anserw.add(checking(0,7,8,7, grid));
        anserw.add(checking(0,8,8,8, grid));
        for(boolean i: anserw){
            if(i == false)
                return false;
        }
        return true;
    }
    public static boolean checking (int startA , int startB, int endA, int endB, int[][] grid){
        Set<Integer> check = new HashSet<>();
        for (int i = startA;  i<= endA; i++) {
            for (int j = startB; j <=endB ; j++) {
                check.add(grid[i][j]);
            }
        }
        if (check.size() != 9)
            return false;
        else
            return true;
    }
}



