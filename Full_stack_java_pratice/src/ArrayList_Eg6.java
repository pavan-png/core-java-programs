

import java.util.ArrayList;

public class ArrayList_Eg6
{
    public static void main(String[] args)
    {
        // Create an ArrayList (can store different data types because no generics are used)
        ArrayList al1 = new ArrayList();

        // Add elements into the ArrayList
        al1.add(10);        // Integer value
        al1.add(20);        // Integer value
        al1.add("deepak");  // String value (heterogeneous data allowed)

        // Convert ArrayList into an array
        // toArray() returns Object[] because list contains mixed data types
        Object[] obj = al1.toArray();

        // Loop through the array
        for(int i = 0; i < obj.length; i++)
        {
            // Print each element of the array
            System.out.println(obj[i]);
        }
    }
}