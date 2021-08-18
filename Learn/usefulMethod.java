package Learn;

// import javax.swing.JOptionPane;
import java.util.Scanner;

public class usefulMethod {
    public static void main(String[] args) {
        
        double a;
        double b;
        Scanner jin = new Scanner(System.in);

        System.out.println("Enter a:");
        a = jin.nextInt();

        System.out.println("Enter b:");
        b = jin.nextInt();
        
        System.out.println("The hypotenuse is:");
        System.out.println(Math.sqrt((a*a) + (b*b)));
        
        
    }
}
