public class _interface {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();
        
    }
}

class Hawk implements Predator{
    @Override
    public void hunt(){
        System.out.println("*The hawk is hunting*");
    }
}

class Rabbit implements Prey{ // implements means that Rabbit use the interface Prey
    @Override
    public void flee(){
        System.out.println("*The Rabbit is fleeing*");
    }
}   

class Fish implements Prey, Predator{
    @Override
    public void hunt(){
        System.out.println("*This fish is hunting smaller fish*");
    }
    public void flee(){
        System.out.println("*This fish is hunting smaller fish*");
    }
}

interface Prey {
    void flee(); // interface is just like inheritence
}

interface Predator {
    void hunt();
}
