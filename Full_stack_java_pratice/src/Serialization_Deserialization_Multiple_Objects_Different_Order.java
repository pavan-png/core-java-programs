import java.io.*;

class Sample_4 implements Serializable{
    String s = "hello";
    String s1 =  "hi";
}
public class Serialization_Deserialization_Multiple_Objects_Different_Order implements Serializable{
    int a = 34;
    int b = 22;
    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
        Sample_4 obj = new Sample_4();
        Serialization_Deserialization_Multiple_Objects_Different_Order obj1 = new Serialization_Deserialization_Multiple_Objects_Different_Order();

        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.ser");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.writeObject(obj1);

        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\new1\\sample.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Serialization_Deserialization_Multiple_Objects_Different_Order obj2   = (Serialization_Deserialization_Multiple_Objects_Different_Order)  ois.readObject();
        Sample_4 obj3 = (Sample_4) ois.readObject();
        // results in ClassCastException as the deserialization order is not as of Serialization.

    }
}
