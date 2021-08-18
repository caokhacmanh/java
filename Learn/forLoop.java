package Learn;
import java.rmi.server.LogStream;
import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        int inp;
        boolean chk = false;
        Scanner jin = new Scanner(System.in);
        inp = jin.nextInt();
        for(int i = 2; i <= inp; ++i){
            chk = true;
            for(int x = 2; x < i; ++x){
                if(i % x == 0){
                    chk = false;
                    break;
                }
            }
            if(chk){
                System.out.print(i + " ");
            }
            
        }
    }
}
