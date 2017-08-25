/**
 * Created by Paweł on 2017-08-25.
 */
//The algorithm works as follows: each pixel x in the resulting
//        image has a value equal to the average value of the input image
//        pixels' values from the 3 × 3 square with the center at x. All pixels at the edges are cropped.
//        As pixel's value is an integer, all fractions should be rounded down.

public class Main {
    public static void main(String... args){
        int[][] array = {{1,1,1},{1,7,1},{1,1,1}};
        int[][] result = boxBlur(array);
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j <result[i].length ; j++) {
                System.out.println(result[i][j]);
            }
        }
    }
    static int[][] boxBlur(int[][] image) {
        int height = image.length;
        int width = image[0].length;
        int[][] result = new int[height- 2][width - 2];
        for (int i = 1; i <height - 1 ; i++) {
            for (int j = 1; j < width - 1; j++) {
                result[i-1][j-1] = image[i-1][j-1] + image[i-1][j] + image[i-1][j+1];
                result[i-1][j-1] += image[i][j-1] + image[i][j]+ image[i][j+1];
                result[i-1][j-1] += (image[i+1][j-1] + image[i+1][j]+ image[i+1][j+1]);
                result[i-1][j-1] = (result[i-1][j-1]/9);
            }
        }

        return result;
    }
}
