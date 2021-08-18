package Learn;
import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        String inp = "";
        Scanner jin = new Scanner(System.in);
        while(inp.isBlank()){ // isBlank mean "is 'inp' blank?"
            System.out.print("Enter your name: ");
            inp = jin.nextLine();
        }
        System.out.println("Hello " + inp);
    }
}
