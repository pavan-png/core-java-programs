

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EfficientReadExample {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\Pavan\\Downloads\\Documents\\data.txt");

        FileReader fr = new FileReader(f);

        // Creating array equal to file size
        char[] ch = new char[(int) f.length()];

        // Reading entire file into array
        fr.read(ch);

        // Printing data
        for (char data : ch) {
            System.out.print(data);
        }

        fr.close();
    }
}