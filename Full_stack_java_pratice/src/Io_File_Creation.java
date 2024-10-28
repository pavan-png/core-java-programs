import java.io.*;
public class Io_File_Creation {
    public static void main(String[] args) throws IOException{
        String file_Name = "hello.txt";
       /*
       this line will check whether the file  called "abc.txt" exists (or) not. if it is available it
       would then go and point to that file . otherwise it will represent a java file object , not a
       physical file.
        */
        File f = new File(file_Name);
        System.out.println(f.exists());

        // it will create a physical file for the file object.
        f.createNewFile();
        System.out.println(f.exists());

        /*
        1st run
            false
            true

        2nd run
            true
            true
        */
    }
}
