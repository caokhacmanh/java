package Learn;


import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        String inp;
        Scanner jin = new Scanner(System.in);
        System.out.println("Input name babe: ");
        inp = jin.nextLine();
        System.out.println(inp);
        System.out.println("Input olds babe: ");
        int olds = jin.nextInt();
        System.out.println(olds);
    }
}
