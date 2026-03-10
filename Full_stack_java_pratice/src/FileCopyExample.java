
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyExample {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new FileReader("C:\\Users\\Pavan\\Downloads\\Documents\\print.txt"));

        BufferedWriter bw =
                new BufferedWriter(new FileWriter("C:\\Users\\Pavan\\Downloads\\Documents\\file3.txt"));

        String line;

        // Reading file1
        while ((line = br.readLine()) != null) {

            bw.write(line);
            bw.newLine();

        }

        br.close();
        bw.close();

        System.out.println("File copied successfully");

    }
}