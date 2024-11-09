import java.io.*;

class Dog_3 implements Serializable {
    int i = 10;
    int j = 20;
    @Serial
    private static final long serialVersionUID = 10L;

}
public class Serial_Version_Uid_Sender  {
    public static void main(String[] args) throws IOException{
        Dog_3 obj = new Dog_3();
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.ser");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
    }
}
