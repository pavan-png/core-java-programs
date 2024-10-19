import java.util.ArrayList;

public class Collection_Without_Using_Stream_Eg1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        al.add(30);
        al.add(35);
        al.add(40);
        ArrayList<Integer> al1 = new ArrayList<>();
        for (Integer i : al){
            al1.add(i*2);
        }
        System.out.println(al1);
    }
}
