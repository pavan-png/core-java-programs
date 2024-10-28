import java.io.File;
import java.io.IOException;

public class Io_File_Inside_Directory {
    public static void main(String[] args)throws IOException {
        // below directory will be created in the current working directory
        File f = new File("Io_Directory_Eg_With_File_Inside_It");
        f.mkdir();
        System.out.println("is f pointing to the directory "+f.isDirectory());
        System.out.println();

        File f1 = new File(f,"Io_Sample_File.txt");
        f1.createNewFile();
        System.out.println("is f pointing to the directory "+f.isFile());
    }
}
