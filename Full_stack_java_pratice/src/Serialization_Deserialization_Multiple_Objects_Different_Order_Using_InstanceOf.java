import java.io.*;

class Sample_5 implements Serializable{
    String s = "hello";
    String s1 =  "hi";
}
public class Serialization_Deserialization_Multiple_Objects_Different_Order_Using_InstanceOf implements Serializable{
    int a = 34;
    int b = 22;
    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {
        Sample_5 obj = new Sample_5();
        Serialization_Deserialization_Multiple_Objects_Different_Order_Using_InstanceOf obj1 = new Serialization_Deserialization_Multiple_Objects_Different_Order_Using_InstanceOf();

        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.ser");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.writeObject(obj1);

        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\new1\\sample.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        if ( o instanceof Serialization_Deserialization_Multiple_Objects_Different_Order_Using_InstanceOf ){
            Serialization_Deserialization_Multiple_Objects_Different_Order_Using_InstanceOf obj2 = (Serialization_Deserialization_Multiple_Objects_Different_Order_Using_InstanceOf) o;
            System.out.println(obj2.a);
        }
        else if (o instanceof Sample_5){
            Sample_5 obj3 = (Sample_5)o;
            System.out.println(obj3.s1);
        }


    }
}
