package Learn;
import java.util.*;

public class forEachLoop {
    public static void main(String[] args) {
        // String animals[] = new String[4];
        // animals[0] = "cat";
        // animals[1] = "dog";
        // animals[2] = "rat";
        // animals[3] = "bird";

        ArrayList<String> animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String i : animals){
            System.out.println(i);
        }

    }
}
