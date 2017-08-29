/**
 * Created by Paweł on 2017-08-29.
 */

/**
 * The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line.
 * Each of them has a single 100, 50 or 25 dollars bill. A "Avengers" ticket costs 25 dollars.
 Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
 Can Vasya sell a ticket to each person and give the change if he initially has no money and sells the tickets strictly
 in the order people follow in the line?
 Return YES, if Vasya can sell a ticket to each person and give the change. Otherwise return NO.
 */
public class Main {
    public static void main(String... args){
        int[] customers = {25,100};
        System.out.println(Line.Tickets(customers));
    }
}
class Line {
    public static String Tickets(int[] peopleInLine) {
        int quarter = 0;
        int half = 0;
        for (int i = 0; i <peopleInLine.length ; i++) {
            if(peopleInLine[i] == 25){
                quarter++;
            }else if(peopleInLine[i] == 50){
                half++;
                if(quarter < 1){
                    return "NO";
                }
                quarter--;
            }else{
                if(half < 1){
                    if(quarter < 3){
                        return "NO";
                    }
                    else{
                        quarter = quarter-3;
                    }
                }else if(quarter < 1){
                    return "NO";
                }
                else{
                    quarter--;
                    half--;
                }
            }
        }
        return "YES";
    }
}
