/**
 * Created by Paweł on 2017-08-29.
 */

/**
 * Your task is to construct a building which will be a pile of n cubes. The cube at the bottom will have a volume of n^3,
 * the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.

 You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?

 The parameter of the function findNb (find_nb, find-nb, findNb) will be an integer m and you have to return the integer n
 such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.
 */
public class Main {
    public static void main(String...args){
        long number = 1071225;
        System.out.println(ASum.findNb(number));
    }
}
 class ASum {
     public static long findNb(long m) {
         long n = 1;
         long temp = 1;
         while (temp != m){
             n++;
             temp += (n*n*n);
             if(temp > m){
                 return -1;
             }
         }
         return n;
     }
}