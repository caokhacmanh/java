package Prog;

import java.util.Random;

public class randBetween {
    
    public static int randBetween(int x, int y){
        Random rnd = new Random();
        int ans = rnd.nextInt(y - x + 1);
        ans = ans + x;
        return ans;
    }


}
