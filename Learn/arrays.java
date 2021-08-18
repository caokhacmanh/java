package Learn;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        int n = jin.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; ++i){
            arr[i] = jin.nextInt();
        }
        for(int i = 0; i < arr.length; ++i){
            System.out.println(arr[i]);
        }
    }
}
