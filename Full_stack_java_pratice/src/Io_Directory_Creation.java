import java.io.File;

public class Io_Directory_Creation {
    public static void main(String[] args) {
        String s = "Io_Eg_Directory_Creation";
        /*
        For jvm Whenever you specify any name without extension, it treats as directory.
        For jvm no difference between file and directory
         */

        File f = new File(s);
        System.out.println(f.exists());
        System.out.println();
        // method used to create a directory
        f.mkdir();
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
