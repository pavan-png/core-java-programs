import java.io.*;

public class Serial_Version_Uid_Reciever  {

    /*
    if serialversionuid is changed after the execution of sender it results ClassCastException here.
    since Dog_3 is in default location. we cannot write another Dog_3 class during deserialization.
    if serialization and deserialization is done in different systems then compulsorily the serialized class
    Dog_3 should be present in the deserialization class also.
     */
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {

        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\new1\\sample.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog_3 obj1  = (Dog_3) ois.readObject();
        System.out.println(obj1.i);
        System.out.println(obj1.j);




    }
}
