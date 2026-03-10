

import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterExample {

    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("C:\\Users\\Pavan\\Downloads\\Documents\\print.txt");

        // Writing different data types
        pw.println("Hello Java");

        pw.println(100);

        pw.println(45.67);

        pw.println(true);

        pw.println('A');

        pw.close();

        System.out.println("PrintWriter completed");

    }
}