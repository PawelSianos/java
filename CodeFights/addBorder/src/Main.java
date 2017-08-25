/**
 * Created by Paweł on 2017-08-25.
 */

//Given a rectangular matrix of characters,
//add a border of asterisks(*) to it.
public class Main {
    public static void main(String... args){
        String[] text = {"abc", "def"};
        String[] result = addBorder(text);
        for(String a: result){
            System.out.println(a);
        }
    }
    static String[] addBorder(String[] picture) {
        int arraySize = picture.length;
        int ArrayElementSize = picture[0].length();
        String[] bordered = new String[arraySize + 2];
        for (int i = 0; i < bordered.length; i++) {
            if(i == 0 || i == (bordered.length - 1)){
                StringBuilder builder = new StringBuilder();
                for (int j = 0; j < ArrayElementSize + 2 ; j++) {
                    builder.append("*");
                }
                bordered[i] = builder.toString();
            }
            else {
                StringBuilder builder = new StringBuilder();
                builder.append("*")
                        .append(picture[i-1])
                        .append("*");
                bordered[i] = builder.toString();
            }
        }
        return bordered;
    }
}
