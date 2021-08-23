import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        long n;
        Scanner jin = new Scanner(System.in);
        n = jin.nextLong();
        System.out.println((n+1)*n/2);
        
    }
}

class Holder{
    public int a1;
    public int a2;
    public int a3;

    Holder(int a1, int a2, int a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }
}
