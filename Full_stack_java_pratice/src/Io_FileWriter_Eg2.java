import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Io_FileWriter_Eg2 {
    public static void main(String[] args) throws IOException {
        String s = "C:\\Users\\Administrator\\Downloads\\new1";
        File f = new File(s,"sample.txt");
        FileWriter f1 = new FileWriter(f,false);
        // if pass append argument to false then the previous data will ve overridden
        // go through the FileWriter constructors
        f1.write("\n");
        f1.write(91);
        f1.write("\n");
        f1.write("Hello there, can we meet tonight");
        f1.write("\n");
        char[] c ={'p','a','v','a','n'};
        f1.write(c);

        //the above operations will never be successful if you don't do any of these below two methods
        f1.flush();
        f1.close();
        /*
        closing the resource

         */
        System.out.println("open this location C:\\Users\\Administrator\\Downloads\\new1 and check the text file");

    }
}
