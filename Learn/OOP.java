package Learn;
import java.util.*;

public class OOP {
    
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.model);
    }    

}

class Car {
    String make = "Chevrolet";
    String model = "Corvette";
};
