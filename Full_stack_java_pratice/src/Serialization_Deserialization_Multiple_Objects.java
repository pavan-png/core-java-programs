import java.io.*;

class Sample_3 implements Serializable {
    String s = "hello";
    boolean b = true;
}
public class Serialization_Deserialization_Multiple_Objects implements Serializable{
    int a = 23;
    int b =35;
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Sample_3 obj = new Sample_3();
        Serialization_Deserialization_Multiple_Objects obj1 = new Serialization_Deserialization_Multiple_Objects();
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample1.ser");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.writeObject(obj1);

        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\new1\\sample1.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        Sample_3 obj2 = (Sample_3) o;
        System.out.println(obj2.s);

        Serialization_Deserialization_Multiple_Objects obj3 = (Serialization_Deserialization_Multiple_Objects) ois.readObject();
        System.out.println(obj3.a);
    }
}
