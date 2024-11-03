import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_Writer {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        pw.write(77); // unicode value will be printed
        pw.println(77); // as it is number data is printed
        pw.println("pavan bought a toyata land cruiser");
        pw.println(true);
        pw.flush();
        pw.close();
    }
}
