package Learn;

public class swapTwoVar {
    public static void main(String[] args) {
        String x = "water", y = "Kool-Aid", tmp;
        tmp = x;
        x = y;
        y = tmp;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
