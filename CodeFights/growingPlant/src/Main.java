/**
 * Created by Paweł on 2017-08-26.
 */

//Each day a plant is growing by upSpeed meters.
//Each night that plant's height decreases by downSpeed
//meters due to the lack of sun heat. Initially, plant is 0 meters tall.
//We plant the seed at the beginning of a day. We want to know when
//the height of the plant will reach a certain level.
public class Main {
    public static void main(String... args){
        int up = 100;
        int down = 70;
        int score = 555;
        System.out.println(growingPlant(up, down, score));
    }
    static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int height =0;
        int day = 1;
        while(true){
            height +=upSpeed;
            if(height >= desiredHeight)
                return day;
            else
                height -= downSpeed;
            day++;
        }
    }
}
