import java.util.HashSet;
import java.util.Set;

/**
 * Created by Paweł on 2017-08-26.
 */

//Given a string, find the number of different characters in it.

public class Main {
    public static void main(String...args){
        String word = "faskgllgjiagnfgnn";
        System.out.println(differentSymbolsNaive(word));
    }
    static int differentSymbolsNaive(String s) {
        Set<Character> lista = new HashSet<>();
        for(int i = 0; i< s.length();i++){
            lista.add(s.charAt(i));
        }
        return lista.size();
    }
}
