import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paweł on 2017-08-26.
 */

//Given an array of equal-length strings, check if it is possible
//to rearrange the strings in such a way that after the rearrangement
//the strings at consecutive positions would differ by exactly one character.

public class Main {
    public static void main(String...args){
        String[] array = {"aba", "bbb", "bab"};
        System.out.println(stringsRearrangement(array));
    }
    static boolean stringsRearrangement(String[] inputArray) {
        List<String> arr = new ArrayList<String>();
        for (String s: inputArray) {
            arr.add(s);
        }
        premutations(new ArrayList<String>(), arr);
        boolean ans = false;
        for (ArrayList<String> current: premutations) {
            if(check(current)) ans = true;
        }
        return ans;
    }

    static boolean check(ArrayList<String> ar) {
        for (int i = 1; i < ar.size(); i++) {
            int diffCount = count(ar.get(i-1), ar.get(i));
            if (diffCount != 1) return false;
        }
        return true;
    }

    static int count(String s1, String s2) {
        int count = 0;
        for(int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) count++;
        }
        return count;
    }

    static ArrayList<ArrayList<String>> premutations = new ArrayList<ArrayList<String>>();

    static void premutations(ArrayList<String> current, List<String> notUsed) {
        if (notUsed.size() == 0) {
            premutations.add(new ArrayList<String>(current));
            return;
        }
        for (String s: notUsed) {
            ArrayList<String> newCurr = new ArrayList<>(current);
            List<String> newNotUsed = new ArrayList<String>(notUsed);
            newCurr.add(s);
            newNotUsed.remove(s);
            premutations(newCurr, newNotUsed);
        }
    }
}
