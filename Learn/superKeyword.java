package Learn;

public class superKeyword {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 42, "$$$");    
        Hero hero2 = new Hero("Superman", 43, "$everything");    
        System.out.println(hero2);
    }
}


class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age; 
    }

    public String toString(){
        return name + "\n" + age + "\n";
    }
}

class Hero extends Person {
    String power;

    Hero(String name, int age, String power){
        super(name, age); // run the Person(String name, int age){} in it's parent class
        this.power = power;
    }

    public String toString(){
        return super.toString() + power;
    }
}
