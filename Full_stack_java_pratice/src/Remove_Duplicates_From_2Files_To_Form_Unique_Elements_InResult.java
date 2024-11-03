import java.io.*;

public class Remove_Duplicates_From_2Files_To_Form_Unique_Elements_InResult {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample1.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(1111);
        pw.println(2222);
        pw.println(3333);
        pw.println(4444);
        pw.println(5555);
        pw.flush();
        pw.close();

        File f1 = new File("C:\\Users\\Administrator\\Downloads\\new1","sample2.txt");
        f1.createNewFile();
        FileWriter fw1 = new FileWriter(f1);
        PrintWriter pw1 = new PrintWriter(fw1);
        pw1.println(2222);
        pw1.println(3333);
        pw1.println(4444);
        pw1.flush();
        pw1.close();

        File f2 = new File("C:\\Users\\Administrator\\Downloads\\new1","sample3.txt");
        f2.createNewFile();
        FileWriter fw2 = new FileWriter(f2);
        PrintWriter pw2 = new PrintWriter(fw2);

        FileReader fr = new FileReader("C:\\Users\\Administrator\\Downloads\\new1\\sample1.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();



        while(s!=null ){
            FileReader fr1 = new FileReader("C:\\Users\\Administrator\\Downloads\\new1\\sample2.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            String s1 = br1.readLine();
            boolean b = false;
            while (s1!=null){
                if (s1.equals(s)){
                    b = true;
                    break;
                }
                s1 = br1.readLine();
            }

            if (b == false){
                pw2.println(s);
                pw2.flush();
            }
            s = br.readLine();
        }


        pw2.close();
        br.close();



    }
}
