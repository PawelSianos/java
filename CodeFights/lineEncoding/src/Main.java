/**
 * Created by Paweł on 2017-08-26.
 */

/**
 Given a string, return its encoding defined as follows:

 First, the string is divided into the least possible number
 of disjoint substrings consisting of identical characters
 for example, "aabbbc" is divided into ["aa", "bbb", "c"]
 Next, each substring with length greater than one is replaced
 with a concatenation of its length and the repeating character

 for example, substring "bbb" is replaced by "3b"
 Finally, all the new strings are concatenated together in the
 same order and a new string is returned.
 */
public class Main {
    public static void main(String... args){
        System.out.println(lineEncoding("aaabbbcccddddeeeee"));
    }
    static String lineEncoding(String s) {
        StringBuilder builder = new StringBuilder();
        int counter = 1;
        for(int i = 1; i< s.length();i++){
            if(s.charAt(i-1) == s.charAt(i)){
                counter++;
            }
            else if(counter > 1){
                builder.append(counter)
                        .append(s.charAt(i-1));
                counter = 1;
            }
            else
                builder.append(s.charAt(i-1));
        }
        if(counter > 1 )
            builder.append(counter);

        return   builder.append(s.charAt(s.length()-1)).toString();
    }

}
