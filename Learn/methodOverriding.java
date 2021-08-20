package Learn;

public class methodOverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
    }
}

class Animal {
    void speak(){
        System.out.println("The animal is speaking");
    }
}

class Dog extends Animal{
    
    @Override // just for attention, unnecessary
    void speak(){
        System.out.println("The dog goes *bark*");
    }
}
