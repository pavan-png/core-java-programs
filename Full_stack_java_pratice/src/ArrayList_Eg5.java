
import java.util.ArrayList;

public class ArrayList_Eg5
{
    public static void main(String[] args)
    {
        // Create first ArrayList (al1)
        ArrayList al1 = new ArrayList();

        // Adding elements to al1
        al1.add(10);
        al1.add(20);

        // Create second ArrayList (al2)
        ArrayList al2 = new ArrayList();

        // Adding elements to al2
        al2.add(10);
        al2.add(20);
        al2.add("deepak");   // heterogeneous element (String)

        // Adding al2 into al1
        // IMPORTANT: This adds the whole al2 as ONE element inside al1
        al1.add(al2);

        // Printing al1
        // Output: [10, 20, [10, 20, deepak]]
        System.out.println(al1);

        // Accessing elements of al1
        System.out.println(al1.get(0)); // 10
        System.out.println(al1.get(1)); // 20

        // Accessing the inner ArrayList (al2) from al1
        ArrayList innerList = (ArrayList) al1.get(2);

        // Accessing elements of inner list
        System.out.println(innerList.get(0)); // 10
        System.out.println(innerList.get(1)); // 20
        System.out.println(innerList.get(2)); // deepak
    }
}