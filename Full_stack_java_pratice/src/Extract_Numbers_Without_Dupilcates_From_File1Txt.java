import java.io.*;

public class Extract_Numbers_Without_Dupilcates_From_File1Txt {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample1.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(111);
        pw.println(222);
        pw.println(333);
        pw.println(222);
        pw.println(444);
        pw.println(555);
        pw.println(333);
        pw.println(666);
        pw.flush();
        pw.close();

        FileReader fr = new FileReader("C:\\Users\\Administrator\\Downloads\\new1\\sample1.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();

        File f1 = new File("C:\\Users\\Administrator\\Downloads\\new1","sample2.txt");
        f1.createNewFile();
        FileWriter fw1 = new FileWriter(f1);
        PrintWriter pw1 = new PrintWriter(fw1);

        while (s != null) {
            FileReader fr1 = new FileReader("C:\\Users\\Administrator\\Downloads\\new1\\sample2.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            boolean b = false;
            String s1 = br1.readLine();
            while (s1 != null) {
                if (s1.equals(s)==true) {
                    b = true;
                    break;
                }
                s1 = br1.readLine();
            }
            if (b == false) {
                pw1.println(s);
                /*
                The flush() method of PrintWriter Class in Java is used to flush the stream.
                By flushing the stream, it means to clear the stream of any element that may be
                or maybe not inside the stream. It neither accepts any parameter nor returns any value.
                 */
                pw1.flush();

            }
            s = br.readLine();
        }
        pw1.close();
        br.close();

    }
}
