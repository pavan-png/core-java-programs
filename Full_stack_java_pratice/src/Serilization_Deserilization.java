import java.io.*;

/*
public java.io. ObjectOutputStream(java.io. OutputStream) throws java.io. IOException;
public java. io. FileOutputStream(java. lang. String) throws java. io. FileNotFoundException;
public final void write0bject(java.lang.Object) throws java.io. IOException;

public java. io. ObjectInputStream(java. io. InputStream) throws java.io. IOException;
public java. io. FileInputStream(java. lang. String) throws java. io. FileNotFoundException;
public final java. lang. Object readObject() throws java. io. IOException, java. lang. ClassNotFoundException;
 */

public class Serilization_Deserilization implements Serializable {
    public  Serilization_Deserilization(){
        System.out.println("object created ");
    }
    int i = 10;
    int j = 20;
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.ser");
        /*
        Whenever writing is happening, where the data should go and write the destination file ,
        you need not want to create , automatically it gets created. And you can control appending or
        overriding through the argument. here writing is happening at specified location. so the file
        should be created manually
        */

        f.createNewFile();

        Serilization_Deserilization obj = new Serilization_Deserilization();
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
        Serilization_Deserilization obj1 = (Serilization_Deserilization) o;
        System.out.println("deserialized object reference "+obj1);
        /*
        When you are working with deserialization object is created, but creation of this object is
        not been done without the help of constructor. It is automated with respect to readObject() method.
        we don’t have a control on that. so constructor is not called again when object is created
        after deserialization.
         */


    }
}
