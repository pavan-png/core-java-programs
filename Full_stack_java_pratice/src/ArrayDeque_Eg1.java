
import java.util.ArrayDeque;
public class ArrayDeque_Eg1 {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(40);
        System.out.println(ad);

        ArrayDeque ad1 = new ArrayDeque();
        ad1.add("hello");
        ad1.add(28.5);
        ad1.add(25L);
        System.out.println(ad1);
        ad.addAll(ad1);
        System.out.println("adding another collection to ArrayDeque "+ad);
        ad1.addFirst("zero index");
        System.out.println(ad1);
        ad1.addLast("last index");
        System.out.println(ad1);
        ad1.clear();
        System.out.println("after using clear method ");
        System.out.println(ad1);
    }
}
