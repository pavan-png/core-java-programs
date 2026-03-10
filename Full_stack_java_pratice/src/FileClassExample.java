import java.io.File;
import java.io.IOException;

public class FileClassExample {

    public static void main(String[] args) throws IOException {

        // Creating File object (only object created, file not created physically)
        File f = new File("C:\\Users\\Pavan\\Downloads\\Documents\\student.txt");

        // Creating file physically
        if (f.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }

        // Creating directory
        File dir = new File("C:\\Users\\Pavan\\Downloads\\Documents\\myfolder");
        dir.mkdir();

        // Checking file properties
        System.out.println("File exists : " + f.exists());
        System.out.println("Is file : " + f.isFile());
        System.out.println("Is directory : " + f.isDirectory());
        System.out.println("File size : " + f.length());

        // Rename file
        File newFile = new File("C:\\Users\\Pavan\\Downloads\\Documents\\student_new.txt");
        f.renameTo(newFile);

        // Delete file
        // newFile.delete();

    }
}