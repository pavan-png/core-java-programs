

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) throws IOException {

        // Opening file for reading
        FileReader fr = new FileReader("C:\\Users\\Pavan\\Downloads\\Documents\\data.txt");

        int i;

        // read() reads one character at a time
        while ((i = fr.read()) != -1) {

            // converting unicode value to character
            System.out.print((char) i);

        }

        fr.close();
    }
}