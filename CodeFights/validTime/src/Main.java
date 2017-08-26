/**
 * Created by Paweł on 2017-08-26.
 */
//Check if the given string is a correct time representation of the 24-hour clock.
public class Main {
    public static void main(String... args){
        System.out.println(validTime("23:22"));
    }
    static boolean validTime(String time) {
        return Integer.valueOf(time.substring(0,2)) < 24 && Integer.valueOf(time.substring(3)) < 60;

    }

}
