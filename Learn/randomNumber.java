package Learn;

import java.util.Scanner;
import java.util.Random;

public class randomNumber {
    public static void main(String[] args) {
        Random rnd = new Random();
        // int x = rnd.nextInt();
        // int x = rnd.nextInt(6); // from 0 -> 5
        // double y = rnd.nextDouble();
        boolean z = rnd.nextBoolean();

        System.out.println(z);
    }
}
