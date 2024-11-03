import java.io.*;

public class Copy_File1Txt_File2Txt_To_File3Txt {
    public static void main(String[] args) throws IOException {
       // creating file 1 and writing data
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample1.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f,false);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("this is file 1 line1 data ");
        pw.println("this is file 1  line2 data");
        pw.flush();
        pw.close();

        // creating file 2 and writing data
        File f1 = new File("C:\\Users\\Administrator\\Downloads\\new1","sample2.txt");
        f1.createNewFile();
        FileWriter fw1 = new FileWriter(f1,false);
        PrintWriter pw1 = new PrintWriter(fw1);
        pw1.println("this is file 2 line1 data ");
        pw1.println("this is file 2 line2 data ");
        pw1.flush();
        pw1.close();


        // creating file 3
        File f2 = new File("C:\\Users\\Administrator\\Downloads\\new1","sample3.txt");
        f2.createNewFile();
        FileWriter fw2 = new FileWriter(f2,true);
        PrintWriter pw2 = new PrintWriter(fw2);

        // reading the data from file 1 and writing it in the file 3
        FileReader fr = new FileReader("C:\\Users\\Administrator\\Downloads\\new1\\sample1.txt");
        BufferedReader br = new BufferedReader(fr);
        String s =  br.readLine();
        while ( s != null){
            pw2.println(s);
            s = br.readLine();
        }

        br.close();



        // reading data from file 2 and writing it in the file 3
        FileReader fr1 = new FileReader("C:\\Users\\Administrator\\Downloads\\new1\\sample2.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        String s1 = br1.readLine();
        while (s1!=null){
            pw2.println(s1);
            s1 = br1.readLine();
        }
        // make sure to use flush() and close() methods at last on printwriter and BufferReader objects, if not used
        // data will not be written on text file.
        pw2.flush();
        pw2.close();
        br1.close();
    }
}
