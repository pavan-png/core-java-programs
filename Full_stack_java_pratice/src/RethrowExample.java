import java.io.FileReader;
import java.io.IOException;

class RethrowExample {

    // This method catches and rethrows
    static void readFile() throws IOException {
        try {
            FileReader fr = new FileReader("test.txt");
            System.out.println("File opened successfully");
        } catch (IOException e) {
            System.out.println("Exception occurred in readFile()");

            // Rethrowing the same exception
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception handled in main()");
            System.out.println(e.getMessage());
        }
    }
}