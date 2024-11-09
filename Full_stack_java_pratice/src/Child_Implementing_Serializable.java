import java.io.*;

class Animal{
    int i =10;
}
class Dog_2 extends Animal implements Serializable {
    int j = 20;
}
public class Child_Implementing_Serializable {
    public static void main(String[] args)throws FileNotFoundException,IOException,ClassNotFoundException {
        Dog_2 d = new Dog_2();
        d.i = 99;
        d.j = 100;
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.ser");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\new1\\sample.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog_2 d1 = (Dog_2) ois.readObject();
        System.out.println(d1.i);
        System.out.println(d1.j);

    }
}
