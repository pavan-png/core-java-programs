import java.io.*;

class Account implements Serializable{
    String userName = "sachin";
    transient  String password = "tendulkar";
    private void writeObject(ObjectOutputStream oos) throws Exception{
        System.out.println("write object method is called ");
        oos.defaultWriteObject();
        String encry = "234"+password;
        oos.writeObject(encry);
    }

    private void readObject(ObjectInputStream ois)throws Exception{
        System.out.println("read object method is called");
        ois.defaultReadObject();
        String encyt = (String) ois.readObject();
        password = encyt.substring(3);
    }
}
public class Customized_Serialization_Transit implements Serializable {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
       Account ac = new Account();
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.ser");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ac);


        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\new1\\sample.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account ac1 = (Account) ois.readObject();
        System.out.println(ac1.password);
    }
}
