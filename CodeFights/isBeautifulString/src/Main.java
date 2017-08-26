/**
 * Created by Paweł on 2017-08-26.
 */

//A string is said to be beautiful if b occurs in it no more
//times than a; c occurs in it no more times than b;etc.
//Given a string, check whether it is beautiful.
public class Main {
    public static void main(String... args){
        String word = "aaggciebbd";
        System.out.println(isBeautifulString(word));
    }
    static boolean isBeautifulString(String inputString) {
        char[] table = new char[26];
        for (int i = 0; i < inputString.length(); i++) {
            table[inputString.charAt(i) -'a']++;
        }
        for (int i = 0; i <table.length-1 ; i++) {
            if(table[i]<table[i+1])
                return false;
        }
        return true;
    }
}
