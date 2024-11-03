import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Writer  {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f,false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("pavan bought a villa at amaravathi");
        bw.newLine();
        char[] c = {'h','i'};
        bw.write(c);
        bw.flush(); // to make sure the operation is successful on the file
        bw.close(); // internally fw.close() will happen

        /*
    Note :
    1.bw.close()// recomended to use

    2.fw.close()// not recomended to use
    3.bw.close()// not recomended to use
    When ever we are closing BufferedWriter automatically underlying writer will be closed and
    we are not close explicitly.
         */

    }
}
