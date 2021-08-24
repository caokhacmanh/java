package Learn;
public class _porlymorphism {
    public static void main(String[] args) {
        Car6 car = new Car6();
        Boat boat = new Boat();
        Bicycle2 bicycle = new Bicycle2();

        // :: All wrong ::
        // Car6 racers[] = {car, bicycle, boat};
        // Bicycle2 racers[] = {car, bicycle, boat};
        // Boat racers[] = {car, bicycle, boat};

        // => they all have the same are all extends to Vehicle, so the racers[] should be Vehicle types
        Vehicle racers[] = {car, bicycle, boat};

        // :: print them out ::
        // car.go();
        // bicycle.go();
        // boat.go();

        // :: better way to print them out ::
        for(Vehicle vehicle : racers){
            vehicle.go();
        }
    }
}

class Vehicle {

    // :: we need it because we are using vehicle.go() in main method ::
    @Override
    public void go() {

    }
}

class Car6 extends Vehicle {
    @Override
    public void go() {
        System.out.println("The car is going");
    }
}

class Bicycle2 extends Vehicle {
    @Override
    public void go() {
        System.out.println("The Bicycle is going");
    }
}

class Boat extends Vehicle {
    @Override
    public void go() {
        System.out.println("The Boat is going");
    }
}
