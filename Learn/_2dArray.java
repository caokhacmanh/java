package Learn;
import java.util.Scanner;

public class _2dArray {
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = jin.nextInt();
        System.out.print("Input y: ");
        int y = jin.nextInt();
        int arr[][] = new int[x][y];
        for(int i = 0; i < x; ++i){
            for(int t = 0; t < y; ++t){
                arr[i][t] = jin.nextInt();
            }
        }
        for(int i = 0; i < x; ++i){
            for(int t = 0; t < y; ++t){
                System.out.print(arr[i][t] + " ");
            }
        }
    }
}
