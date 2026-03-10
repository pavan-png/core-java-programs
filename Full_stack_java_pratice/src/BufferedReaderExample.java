
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new FileReader("C:\\Users\\Pavan\\Downloads\\Documents\\buffer.txt"));

        String line;

        // readLine() reads entire line
        while ((line = br.readLine()) != null) {

            System.out.println(line);

        }

        br.close();
    }
}