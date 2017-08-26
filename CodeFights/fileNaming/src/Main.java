/**
 * Created by Paweł on 2017-08-26.
 */

import java.util.ArrayList;

/**
 * You are given an array of desired filenames in the order
 * of their creation. Since two files cannot have equal names,
 * the one which comes later will have an addition to its name
 * in a form of (k), where k is the smallest positive integer
 * such that the obtained name is not used yet.
 *Return an array of names that will be given to the files.
 */
public class Main {
    public static void main(String... args){
        String[] files = {"doc", "doc", "image", "doc(1)", "doc"};
        String[] result = fileNaming(files);
        for(String s: result){
            System.out.println(s);
        }
    }
    static String[] fileNaming(String[] names) {
        ArrayList<String> res = new ArrayList<>(names.length);
        int k;
        for (String s : names) {
            k = 1;
            for (int i = 0; i < res.size(); i++) {
                if (res.get(i).equals(s)) {
                    if (!res.contains(s + "(" + k + ")")) {
                        res.add(s + "(" + k + ")");
                        k++;
                    } else {
                        while(true) {
                            k++;
                            if (!res.contains(s + "(" + k + ")")) {
                                res.add(s + "(" + k + ")");
                                break;
                            }
                        }
                    }
                }
            }
            if (k == 1)
                res.add(s);
        }
        String[] result = new String[res.size()];
        for (int i = 0; i < res.size(); i++)
            result[i] = res.get(i);
        return result;
    }

}
