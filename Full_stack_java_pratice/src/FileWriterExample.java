import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) throws IOException {

        // FileWriter creates file if not exists
        FileWriter fw = new FileWriter("C:\\Users\\Pavan\\Downloads\\Documents\\data.txt");

        // Writing single character (ASCII 65 = A)
        fw.write(65);

        // Writing character array
        char[] ch = {' ', 'J', 'A', 'V', 'A'};
        fw.write(ch);

        // Writing string
        fw.write("\nHello Java Developers");

        // Flush forces data from memory buffer to file
        fw.flush();

        // Close stream (VERY IMPORTANT)
        fw.close();

        System.out.println("Data written successfully");

    }
}