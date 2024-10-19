import java.util.ArrayList;

public class Collection_Without_Using_Stream {
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

        System.out.println(al);

        // jdk 1.7v
        ArrayList<Integer> al1 = new ArrayList<>();
        for (Integer i : al){
            if (i%2==0){
                al1.add(i);
            }
        }
        System.out.println(al1);

    }
}
