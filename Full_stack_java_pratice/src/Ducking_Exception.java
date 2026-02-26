import java.io.FileReader;
import java.io.IOException;

public class Ducking_Exception {

    // This method is NOT handling the exception
    // It is declaring it using throws
    static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt");
        System.out.println("File opened successfully");
    }

    public static void main(String[] args) {
        try {
            readFile();   // calling method that ducks exception
        } catch (IOException e) {
            System.out.println("Exception handled in main()");
            System.out.println(e.getMessage());
        }
    }
}