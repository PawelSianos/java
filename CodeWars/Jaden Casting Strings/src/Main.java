/**
 * Created by Paweł on 2017-08-28.
 */

/**
 * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
 * Jaden is also known for some of his philosophy that he delivers via Twitter.
 * When writing on Twitter, he is known for almost always capitalizing every word.

 Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith,
 but they are not capitalized in the same way he originally typed them.
 */
public class Main {
    public static void main(String... args){
        String sentence = "most trees are blue";
        System.out.println(JadenCase.toJadenCase(sentence));
    }
}
class JadenCase {

    public static String toJadenCase(String phrase) {
        if(phrase  == null || phrase.isEmpty() )
            return null;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <phrase.length() ; i++) {
            if(i == 0){
                builder.append(phrase.substring(0,1).toUpperCase());
            }
            else if(phrase.charAt(i)== ' ' && i < phrase.length()){
                builder.append(phrase.substring(i,i+2).toUpperCase());
                i++;
            }else{
                builder.append(phrase.charAt(i));
            }
        }
        return builder.toString();
    }

}
