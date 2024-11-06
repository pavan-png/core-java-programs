import java.io.*;

class Kfw_Bank implements Serializable {
    int acc_No = 12547;
    transient int pin_No = 4756;
    transient String pswd = "@pavan";

    private void writeObject(ObjectOutputStream oos) throws IOException{
        oos.defaultWriteObject();
        int encry = pin_No+1111;
        oos.writeInt(encry);
        String encry1 = "123"+pswd;
        oos.writeObject(encry1);
    }
    private void readObject(ObjectInputStream ois)throws IOException,ClassNotFoundException{
        ois.defaultReadObject();
        pin_No =ois.readInt();
        pswd = (String) ois.readObject();

    }


}

public class Customized_Serialization_Transit_Eg2 implements Serializable{
    public static void main(String[] args) throws FileNotFoundException , IOException ,ClassNotFoundException{
        Kfw_Bank obj = new Kfw_Bank();
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.ser");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\new1\\sample.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Kfw_Bank obj1 = (Kfw_Bank) ois.readObject();
        System.out.println(obj1.acc_No);
        System.out.println(obj1.pin_No-1111);
        System.out.println(obj1.pswd.substring(3));

    }
}
