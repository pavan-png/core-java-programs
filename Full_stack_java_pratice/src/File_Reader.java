import java.io.*;
public class File_Reader {
    public static void main(String[] args) throws Exception {
        String location = "C:\\Users\\Administrator\\Downloads\\new1";
        File f = new File(location,"sample.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f,false);
        fw.write("\n");
        fw.write("hi pavan how are you");
        fw.close();

        FileReader fr = new FileReader("C:\\Users\\Administrator\\Downloads\\new1\\sample.txt");
        int i =  fr.read();
        System.out.println(i);
        while (i!=-1){
            System.out.println((char)i);

            i = fr.read();
             /*
            used to read the next character. read() method returns the number, and it is stored in the
            variable i . if there is no text to read in the file this method returns -1.
            */
        }
    }
}
