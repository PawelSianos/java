import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Paweł on 2017-08-29.
 */

//Given two arrays of strings a1 and a2 return a sorted array r
//in lexicographical order of the strings of a1 which are substrings of strings of a2.
    
public interface Main {
    public static void main(String... args){
        String[] a1 = {"arp", "live", "strong"};
        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        String[] result = WhichAreIn.inArray(a1, a2);
        for(String s:result){
            System.out.println(s);
        }
    }
}
class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> result = new HashSet<>();
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if(array2[i].contains(array1[j])){
                    result.add(array1[j]);
                }
            }
        }
        String[] score = result.toArray(new String[result.size()]);
        Arrays.sort(score);
        return score;
    }
}
