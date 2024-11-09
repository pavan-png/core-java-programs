import java.io.*;

class Dog_1 implements Serializable {
    String name = "vishnu";
}
class Puppies extends Dog_1{
    String name_1 = "shiva";
}
public class Serialization_With_Inheritance {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Puppies obj = new Puppies();
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.ser");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\new1\\sample.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Puppies obj1 = (Puppies) ois.readObject();
        System.out.println(obj1.name_1);
        System.out.println(obj1.name);
    }
}
