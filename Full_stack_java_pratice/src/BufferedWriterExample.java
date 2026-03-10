

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) throws IOException {

        // BufferedWriter uses FileWriter internally
        BufferedWriter bw =
                new BufferedWriter(new FileWriter("C:\\Users\\Pavan\\Downloads\\Documents\\buffer.txt"));

        bw.write("Hello Developers");

        // Automatically inserts system dependent newline
        bw.newLine();

        bw.write("Welcome to Java IO");

        bw.newLine();

        bw.write("Buffered writing is faster");

        bw.flush();
        bw.close();

        System.out.println("Buffered writing completed");

    }
}