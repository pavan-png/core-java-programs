import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Reader_Eg1 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.txt");
        f.createNewFile();

        FileWriter f1 = new FileWriter(f,false);
        f1.write("\n");
        f1.write("hello your new ranger rover will be delivered today by 10.00 AM .");
        f1.close();


        FileReader f2 = new FileReader("C:\\Users\\Administrator\\Downloads\\new1\\sample.txt");
        char[] ch = new char[(int) f.length()];
        // read one character and store it in char[]
        f2.read(ch);
        for (char c:ch){
            System.out.println(c);

        }
        f2.close();
    }
}
