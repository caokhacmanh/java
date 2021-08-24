package Learn;
import java.util.Scanner;
import java.util.InputMismatchException;

public class exception {
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        try{

            System.out.println("Enter whole number to divide:");
            int x= jin.nextInt();

            System.out.println("Enter whole number to divide by:");
            int y= jin.nextInt();

            int z = x / y;
            System.out.println("Result: " + z);

        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by 0! IDIOT!");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter a number. OMFG!");
        }
        catch(Exception e){ // catch all exceptions
            System.out.println("Something went wrong");
        }
        finally{ // always execute
            System.out.println("Finished");
            jin.close();
        }

    }
}
