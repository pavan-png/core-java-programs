import java.io.*;

public class Copy_File1Txt_File2Txt_LineByLine_Alternatively_To_File3Txt {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample1.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f,false);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("this is the 1st line of the sample1");
        pw.println("this is the 2nd line of the sample1");
        pw.println("this is the 3rd line of the sample1");
        pw.println("this is the 4th line of the sample1");
        pw.flush();
        pw.close();

        File f1 = new File("C:\\Users\\Administrator\\Downloads\\new1","sample2.txt");
        f1.createNewFile();
        FileWriter fw1 = new FileWriter(f1,false);
        PrintWriter pw1 = new PrintWriter(fw1);
        pw1.println("this is the 1st line of the sample2");
        pw1.println("this is the 2nd line of the sample2");
        pw1.println("this is the 3rd line of the sample2");
        pw1.println("this is the 4th line of the sample2");
        pw1.flush();
        pw1.close();

        File f2 = new File("C:\\Users\\Administrator\\Downloads\\new1","sample3.txt");
        f2.createNewFile();
        FileWriter fw2 = new FileWriter(f2,false);
        PrintWriter pw2 = new PrintWriter(fw2);

        FileReader fr = new FileReader("C:\\Users\\Administrator\\Downloads\\new1\\sample1.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();

        FileReader fr1 = new FileReader("C:\\Users\\Administrator\\Downloads\\new1\\sample2.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        String s1 = br1.readLine();


        while ((s!=null) || (s1!=null)){
            pw2.println(s);
            s = br.readLine();
            pw2.println(s1);
            s1 = br1.readLine();
        }
        pw2.flush();
        pw2.close();
        br.close();
        br1.close();

    }
}
