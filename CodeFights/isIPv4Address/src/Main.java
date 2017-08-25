/**
 * Created by Paweł on 2017-08-25.
 */

//An IP address is a numerical label assigned to each device (e.g., computer, printer)
//participating in a computer network that uses the Internet Protocol for communication.
//There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.
public class Main {
    public static void main(String... args){
        String adres = "172.16.256.1";
        System.out.println(isIPv4Address(adres));
    }
    static boolean isIPv4Address(String inputString) {
        if (!(inputString.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"))) {
            return false;
        }
        String[] splitted = inputString.split("\\.");
        for (int i = 0; i < splitted.length; i++) {

            if (Integer.valueOf(splitted[i]) < 0 || Integer.valueOf(splitted[i]) > 255)
                return false;
        }
        return true;
    }
}
