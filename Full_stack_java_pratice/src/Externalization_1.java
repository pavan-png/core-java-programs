import java.io.*;

class Demo implements Externalizable{
    int i ;
    String s ;
    int j ;
    public Demo(){
        System.out.println("constructor called");
    }

    public Demo(int i , String s ,int j ){
        this.i = i;
        this.s = s;
        this.j = j;
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("write external method called");
        out.writeInt(i);
        out.writeObject(s);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("read external method called ");
        i = in.readInt();
        s = (String) in.readObject();
    }


}
public class Externalization_1 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Demo obj = new Demo(20,"hello",45);
        File f = new File("C:\\Users\\Administrator\\Downloads\\new1","sample.ser");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\new1\\sample.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Demo obj1 = (Demo) ois.readObject();
        System.out.println(obj1.i);
        System.out.println(obj1.s);
        System.out.println(obj1.j);
    }
}
