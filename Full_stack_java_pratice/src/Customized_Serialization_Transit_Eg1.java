import java.io.*;

class Swiss_Account implements Serializable{
    Integer acc_No = 144662489;
    transient String  use_Name = "pavan";
    transient String pswd = "pavan125";
    private void writeObject(ObjectOutputStream oos) throws IOException{
        oos.defaultWriteObject();
        oos.writeObject(use_Name);
        oos.writeObject(pswd);
    }
    private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException{
        ois.defaultReadObject();
       // deserialization should be in the same order as they serialized.
        use_Name = (String) ois.readObject();
        pswd = (String) ois.readObject();
    }

}
public class Customized_Serialization_Transit_Eg1 implements Serializable {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Swiss_Account obj = new Swiss_Account();
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.ser");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\new1\\sample.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Swiss_Account obj1 = (Swiss_Account)ois.readObject();

        System.out.println(obj1.acc_No);
        System.out.println(obj1.use_Name);
        System.out.println(obj1.pswd);
    }
}
