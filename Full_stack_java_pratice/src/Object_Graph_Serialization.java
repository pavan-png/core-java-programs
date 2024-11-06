import java.io.*;

class Dog implements Serializable {
   Cat c = new Cat();
}
class Cat implements Serializable{
    Rat r = new Rat();
}
class Rat implements Serializable{
    int a =10;
}
public class Object_Graph_Serialization implements Serializable{
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Dog d = new Dog();
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.ser");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\new1\\sample.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        Dog d1 = (Dog) o;
        System.out.println(d1.c.r.a);
    }
}
