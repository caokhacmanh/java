package Learn;

// each objects contain different valuables

public class constructors {
    public static void main(String[] args) {
        Human KhacManh = new Human("KhacManh", 13, 1.57); 
        Human KhacDung = new Human("KhacDung", 11, 1.52); 
        KhacManh.eat();
        KhacDung.drink();
    }
}

class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){

        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat(){
        System.out.println(name + " is eating");
    }

    void drink(){
        System.out.println(name + " is drinking");
    }
};