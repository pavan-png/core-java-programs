

import java.io.*;

public class AlternateLineCopy {

    public static void main(String[] args) throws Exception {

        BufferedReader br1 =
                new BufferedReader(new FileReader("C:\\Users\\Pavan\\Downloads\\Documents\\print.txt"));

        BufferedReader br2 =
                new BufferedReader(new FileReader("C:\\Users\\Pavan\\Downloads\\Documents\\buffer.txt"));

        BufferedWriter bw =
                new BufferedWriter(new FileWriter("C:\\Users\\Pavan\\Downloads\\Documents\\file4.txt"));

        String line1, line2;

        while (true) {

            line1 = br1.readLine();
            line2 = br2.readLine();

            if (line1 == null && line2 == null)
                break;

            if (line1 != null) {
                bw.write(line1);
                bw.newLine();
            }

            if (line2 != null) {
                bw.write(line2);
                bw.newLine();
            }

        }

        br1.close();
        br2.close();
        bw.close();

        System.out.println("Alternate copy completed");

    }
}