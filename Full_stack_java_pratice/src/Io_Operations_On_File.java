import java.io.File;

public class Io_Operations_On_File {
    public static void main(String[] args) {
        String location = "C:\\Users\\Administrator\\Desktop\\One Drive\\OneDrive\\Documents";
        File f = new File(location);
        String[] names = f.list();
        int count = 0;
        int file_Count = 0;
        int dir_Count = 0;



        for (String s : names){
            /*
        isDirectory() and isFile() method is  present in the io package , it cant be called on string
        Eg: s.isDirectory().
         creating a file object for the directory
         using f1->filename
         */
            File f1 = new File(f,s);
            if (f1.isFile()){
                file_Count++;
            }
            if (f1.isDirectory()){
                dir_Count++;
            }
            count++;
            System.out.println(s);

        }
        System.out.println("total no of files and directories  are "+count);
        System.out.println("total no of directories "+dir_Count);
        System.out.println("total no of files "+file_Count);
    }
}
