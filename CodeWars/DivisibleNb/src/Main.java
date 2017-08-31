/**
 * Created by Paweł on 2017-08-31.
 */

//Create a function isDivisible(n,x,y) that checks if a number n is divisible by two numbers x AND y
public class Main {
    public static void main(String... args){
        System.out.println(DivisibleNb.isDivisible(100,5,3));
    }
}
class DivisibleNb {
    public static boolean isDivisible(long n, long x, long y) {
        return (n%x == 0 && n%y==0);
    }
}
