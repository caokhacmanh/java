package Learn;

public class encapsulation {
    public static void main(String[] args) {
        Car5 car = new Car5("ABCcar", "XYZmodel", 2000);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}

class Car4 {
    private String make;
    private String model;
    private int year;

    Car4(String make, String model, int year){
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
