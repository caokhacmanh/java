package Learn;

import java.io.FileWriter;
import java.io.IOException; // throw declaration

public class fileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("text.txt");
        writer.write("The first line \n"); // need the \n after
        writer.write("The second line \n");
        writer.append("The third line \n"); // to append to the end of the file
        writer.close();
    }
}
