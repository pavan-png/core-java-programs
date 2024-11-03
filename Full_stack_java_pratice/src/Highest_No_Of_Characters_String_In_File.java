import java.io.*;

public class Highest_No_Of_Characters_String_In_File {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("pavan");
        pw.println("Anand");
        pw.println("charan");
        pw.println("tarun");
        pw.println("teja");
        pw.flush();
        pw.close();

        FileReader fr = new FileReader("C:\\Users\\Administrator\\Downloads\\new1\\sample.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        int maxLength = 0;
        String maxString = "";
        while (s!=null){
           if (s.length()>maxLength){
               maxLength = s.length();
               maxString = s;
           }
           s = br.readLine();
        }
        br.close();
        System.out.println("the max length String is "+maxString);
        System.out.println("no of characters in it is "+maxLength);

    }
}
