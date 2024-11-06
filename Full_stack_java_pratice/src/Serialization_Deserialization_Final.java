import java.io.*;
public class Serialization_Deserialization_Final implements Serializable {
    public  Serialization_Deserialization_Final(){
        System.out.println("object created ");
    }
    final transient int i = 10;
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.ser");


        f.createNewFile();

        Serialization_Deserialization_Final obj = new Serialization_Deserialization_Final();
        System.out.println("serialization started");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        System.out.println("serialized object reference "+obj);
        System.out.println("serialization ended");

        System.out.println();
        System.out.println("deserialization started");
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\new1\\sample.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        System.out.println("deserialization ended");
        Serialization_Deserialization_Final obj1 = (Serialization_Deserialization_Final) o;
        System.out.println("deserialized object reference "+obj1.i);



    }
}
