package Learn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        // should be surrounded by try/catch because the code below maybe dangerous
        try {
            FileReader reader = new FileReader("text.txt");
            int data = reader.read(); // it also read the \n
            while (data != -1) {
                System.out.print((char) data); // make sure use print, not printLn
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
