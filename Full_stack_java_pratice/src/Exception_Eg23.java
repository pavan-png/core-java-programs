import java.io.IOException;


class ReadTheFile_1 {
    static void print() throws IOException {
        throw new IOException();
    }
}

public class Exception_Eg23  extends ReadTheFile{
    public static void main(String[] args){
                try {
                    ReadTheFile_1.print();
                    /* while handling the exception object , the handling exception can be
                     of same (or) parent Exception
                    but if you want to write both child and parent in handling logic for thrown exception object
                    write child first and parent next.
                     */

                }
                catch (IOException e){
                    System.out.println("io exception");
                }catch (Exception e){
                    System.out.println("io exception");
                }



    }

}
