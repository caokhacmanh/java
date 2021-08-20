package Learn;

public class abstraction {
    public static void main(String[] args) {
        Car3 car = new Car3();
        car.go();
    }
}

abstract class Vehicles2 {
    abstract void go();
    
}

class Car3 extends Vehicles2 {

    @Override
    void go() {
        System.out.println("The driver is driving the car");
        
    }
    
}
