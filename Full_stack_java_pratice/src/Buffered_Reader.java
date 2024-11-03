import java.io.*;

public class Buffered_Reader {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("pavan total networth is 1 billion");
        bw.newLine();
        bw.write("billionaire");
        bw.close();
        FileReader fr = new FileReader("C:\\Users\\Administrator\\Downloads\\new1\\sample.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        while (s!= null){
            System.out.println(s);
            s = br.readLine();
        }
        br.close();
        /*
        1.br.close() // recomended to use
        2.fw.close() // not recomended to use
        3.br.close() // not recomended to use
        fw.close()
         Whenever we are closing BufferedReader automatically underlying FileReader will be closed it is
         not required to close explicitly.Even this rule is applicable for BufferedWriter also.
         */
    }
}
