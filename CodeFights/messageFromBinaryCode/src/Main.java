/**
 * Created by Paweł on 2017-08-26.
 */

/**
 * You are taking part in an Escape Room challenge designed specifically for programmers. In your efforts to find a clue,
 * you've found a binary code written on the wall behind a vase, and realized that it must be an encrypted message.
 * After some thought, your first guess is that each consecutive 8 bits of the code stand for the character with the
 * corresponding extended ASCII code.
 * Assuming that your hunch is correct, decode the message.
 */
public class Main {
    public static void main(String ... args){
        System.out.println(messageFromBinaryCode("010010000110010101101100011011000110111100100001"));
    }
    static String messageFromBinaryCode(String code) {
        String[] table = new String[(code.length()/ 8)];
        for (int i = 0, j = 0; i <code.length() ; i=i+8) {
            table[j] = code.substring(i,i+8);
            j++;
        }
        String result = "";
        for (int i = 0; i < table.length; i++) {
            int part =   Integer.parseInt(table[i], 2);
            char[] elem = Character.toChars(part);
            result += Character.toString(elem[0]);
        }
        return result;
    }
}
