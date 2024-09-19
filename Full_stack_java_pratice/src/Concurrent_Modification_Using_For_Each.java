import java.util.ArrayList;

public class Concurrent_Modification_Using_For_Each {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(25);
        al.add(78);
        al.add(10);
        al.add(87);
        al.add(50);

        for(Object obj :al){
            System.out.print(obj + "   ");
            al.add(20);
        }
    }
}
