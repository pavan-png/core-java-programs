import java.io.*;
import java.util.HashSet;

public class RemoveDuplicateNumbers {

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new FileReader("C:\\Users\\Pavan\\Downloads\\Documents\\numbers.txt"));

        BufferedWriter bw =
                new BufferedWriter(new FileWriter("C:\\Users\\Pavan\\Downloads\\Documents\\output.txt"));

        HashSet<String> set = new HashSet<>();

        String line;

        while ((line = br.readLine()) != null) {

            // HashSet automatically removes duplicates
            if (set.add(line)) {

                bw.write(line);
                bw.newLine();

            }
        }

        br.close();
        bw.close();

        System.out.println("Duplicates removed successfully");

    }
}