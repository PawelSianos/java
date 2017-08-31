/**
 * Created by Paweł on 2017-08-31.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Decipher the tweet by looking for words with known meanings.
 * <p>
 * FIRE = "You are fired!"
 * FURY = "I am furious."
 * If no known words are found, or unexpected letters are encountered, then it must be a "Fake tweet."
 * <p>
 * Notes
 * <p>
 * The tweet reads left-to-right.
 * Any letters not spelling words FIRE or FURY are just ignored
 * If multiple of the same words are found in a row then plural rules apply -
 * FIRE x 1 = "You are fired!"
 * FIRE x 2 = "You and you are fired!"
 * FIRE x 3 = "You and you and you are fired!"
 * etc...
 * FURY x 1 = "I am furious."
 * FURY x 2 = "I am really furious."
 * FURY x 3 = "I am really really furious."
 * Examples
 * <p>
 * ex1. FURYYYFIREYYFIRE = "I am furious. You and you are fired!"
 * ex2. FIREYYFURYYFURYYFURRYFIRE = "You are fired! I am really furious. You are fired!"
 * ex3. FYRYFIRUFIRUFURE = "Fake tweet."
 */
public class Main {
    public static void main(String... args) {
        System.out.println(Dinglemouse.fireAndFury("FIREYYFURYYFURYYFURRYFIRE"));
    }
}

class Dinglemouse {
    public static String fireAndFury(final String tweet) {
        List<String> translate = new ArrayList<>();
        for (int i = 0; i < tweet.length() - 3; i++) {
            char c = tweet.charAt(i);
            if(c != 'F' && c != 'I'&&c != 'R'&&c != 'E'&&c != 'U'&& c != 'Y')
                return "Fake tweet.";
            if (tweet.substring(i, i + 4).equals("FIRE")) {
                translate.add("FIRE");
            } else if (tweet.substring(i, i + 4).equals("FURY")) {
                translate.add("FURY");
            }
        }
        if (translate.size() > 0) {
            return creatingMessage(translate);
        } else {
            return "Fake tweet.";
        }
    }

    private static String creatingMessage(List<String> translate) {
        StringBuilder builder = new StringBuilder();
        int fury = 0;
        int fire = 0;
        for (int i = 0; i < translate.size(); i++) {
            if (translate.get(i) == "FIRE") {
                fire++;
                if (fury == 1) {
                    builder.append("I am furious. ");
                    fury = 0;
                } else if (fury > 1) {
                    builder.append("I am ");
                    for (int j = fury - 1; j > 0; j--) {
                        builder.append("really ");
                    }
                    builder.append("furious. ");
                    fury = 0;
                }
            } else if (translate.get(i) == "FURY") {
                fury++;
                if (fire == 1) {
                    builder.append("You are fired! ");
                    fire = 0;
                } else if (fire > 1) {
                    builder.append("You ");
                    for (int j = fire - 1; j > 0; j--) {
                        builder.append("and you ");
                    }
                    builder.append("are fired! ");
                    fire = 0;
                }
            }
        }
        if (fury == 1) {
            builder.append("I am furious.");
        } else if (fury > 1) {
            builder.append("I am ");
            for (int j = fury - 1; j > 0; j--) {
                builder.append("really ");
            }
            builder.append("furious.");
        } else if (fire == 1) {
            builder.append("You are fired!");
        } else if (fire > 1) {
            builder.append("You ");
            for (int j = fire - 1; j > 0; j--) {
                builder.append("and you ");
            }
            builder.append("are fired!");
        }
        return builder.toString();
    }
}