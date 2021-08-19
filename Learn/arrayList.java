package Learn;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // create ArrayList called food
        ArrayList<String> food = new ArrayList<String>();
        
        // add something to the food ArrayList
        food.add("pizza");
        food.add("hamBurGer");
        food.add("hotDog");

        // useful method
        food.set(0, "sushi"); // set food[0] to sushi
        food.remove(2); // to remove food[2]
        food.clear(); // clear all the ArrayList

        // output food's elements
        for(int i = 0; i < food.size(); ++i){
            System.out.println(food.get(i)); // output food[i]
        }

    }
}
