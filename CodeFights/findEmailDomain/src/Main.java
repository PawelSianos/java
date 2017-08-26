/**
 * Created by Paweł on 2017-08-26.
 */

/**
 An email address such as "John.Smith@example.com"is made up of a
 local part ("John.Smith"), an "@" symbol, then a
 domain part ("example.com").
 The domain name part of an email address may
 only consist of letters, digits, hyphens and dots. The local part,
 however, also allows a lot of different special characters.
 Here you can look at several examples of correct and
 incorrect email addresses.
 Given a valid email address, find its domain part.
 */
public class Main {
    public static void main(String... args){
        System.out.println(findEmailDomain("prettyandsimple@example.com"));
    }
    static String findEmailDomain(String address) {
        return address.substring((address.lastIndexOf('@')+1), address.length());
    }
}
