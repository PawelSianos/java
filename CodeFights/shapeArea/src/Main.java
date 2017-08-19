/**
 * Created by Paweł on 2017-08-19.
 */
// Below we will define an n-interesting polygon.
// Your task is to find the area of a polygon for a given n.
// A 1-interesting polygon is just a square with a side of length 1.
// An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending
// 1-interesting polygons to its rim, side by side. You can see the 1-, 2-, 3- and 4-interesting polygons
// For n = 2, the output should be shapeArea(n) = 5;
// For n = 3, the output should be shapeArea(n) = 13.

public class Main {
    public static void main(String[] args){
        System.out.println(shapeArea(2));
    }
    static int shapeArea(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = i;
        int polygon = 1;
        for(int i = 1; i < n; i++){
            polygon = polygon + (arr[i] * 4);
        }
        return polygon;
    }
}
