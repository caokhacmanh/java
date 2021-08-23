package Learn;

public class copyOpject {
    public static void main(String[] args) {
        Car5 car1 = new Car5("Car1", "Trucks", 2000);
        Car5 car2 = new Car5("Car2", "Trucks", 2001);

        // car1 = car2; // the address of the car1 is the same as the address of the car2, so we will comment this

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        
    }
}

class Car5 {
    private String make;
    private String model;
    private int year;

    Car5(String make, String model, int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);

    }


    // getters
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }


    // setters
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

}
