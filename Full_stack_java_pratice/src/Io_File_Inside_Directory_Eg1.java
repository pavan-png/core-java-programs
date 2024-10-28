import java.io.File;
import java.io.IOException;

public class Io_File_Inside_Directory_Eg1 {
    public static void main(String[] args) throws IOException {
        String s = "C:\\Users\\Administrator\\Downloads\\new\\Io_File_Inside_Specific_Directory";
        File f = new File(s);
        f.mkdir();

        File f1 = new File(f,"Sample.txt");
        f1.createNewFile();
    }
}
