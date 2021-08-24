package Learn;

public class inheritance {
    public static void main(String[] args) {
        Car2 car = new Car2();
        Bicycle bike = new Bicycle();

        car.go();
        bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}

class Vehicles {

    double speed;
    
    void go(){
        System.out.println("This vehicle is moving");
    }
    void stop(){
        System.out.println("This vehicle is stopped");
    }
};

class Car2 extends Vehicles{ // extends: recieve everything in Vhicles class
    int wheels = 4;
    int doors = 4;
};

class Bicycle extends Vehicles{
    int wheels = 2;
    int pedals = 2;
};