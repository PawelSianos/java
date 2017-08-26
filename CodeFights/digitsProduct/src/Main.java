/**
 * Created by Paweł on 2017-08-26.
 */

/**
 * Given an integer product, find the smallest positive
 * (i.e. greater than 0) integer the product of whose digits
 * is equal to product.
 * If there is no such integer, return -1 instead.
 */
public class Main {
    public static void main(String... args){
        System.out.println(digitsProduct(12));
    }
    static int digitsProduct(int product) {
        StringBuilder builder = new StringBuilder();
        builder.append("");
        if (product == 0)
            return 10;
        if (product < 10)
            return  product;
        for (int i = 9; i > 1 ; i--) {
            while(product %i == 0){
                builder.insert(0, i);
                product = product /i;
            }
        }
        if(product == 1)
            return Integer.valueOf(builder.toString());
        return -1;
    }
}
