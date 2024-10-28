import java.io.File;

public class Io_Operations_On_File_Eg1 {
    public static void main(String[] args) {
       String s = "C:\\Users\\Administrator\\Desktop\\One Drive\\OneDrive\\Documents";
        File f = new File(s);
         String[] s1 = f.list();
         int count = 0;
         int dir_Count = 0;
         int img = 0;
         int docx = 0;
         for (String names : s1){
            File f1 = new File(f,names);
             if (f1.isDirectory()){
                 dir_Count++;
             }
             if (f1.isFile()){
                 if (names.endsWith(".jpg")){
                     img++;
                 }
                 if (names.endsWith(".docx")){
                     docx++;
                 }
             }
         count++;
         }
        System.out.println("total nof files = "+count);
        System.out.println("total images are = "+img);
        System.out.println("total document files are = "+docx);
        System.out.println("total directories count = "+dir_Count);
    }
}
