package Learn;
import java.io.File;

public class fileClass {
    public static void main(String[] args) {
        File file = new File("text.txt");

        if(file.exists()) { // check if it exists
            System.out.println("That file exists!");
            System.out.println(file.getPath()); // get the file's path in the project
            System.out.println(file.getAbsolutePath()); // get the file's path in the computer
            System.out.println(file.isFile()); // check if it is a file, not a folder
            // file.delete(); // will delete the file

        }else{
            System.out.println("That file does not exist!");
        }
    }
}
