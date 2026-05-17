import java.util.TreeMap;
import java.util.Map;

public class TreeMap_Eg1{

    public static void main(String[] args)
    {
        TreeMap<Integer, String> students = new TreeMap<>();

        // put()
        students.put(103, "Rahul");
        students.put(101, "Amit");
        students.put(105, "Sneha");
        students.put(102, "Priya");
        students.put(104, "Karan");

        System.out.println("Original TreeMap:");
        System.out.println(students);

        // get()
        System.out.println("\nStudent with Roll No 102:");
        System.out.println(students.get(102));

        // containsKey()
        System.out.println("\nContains Roll No 101?");
        System.out.println(students.containsKey(101));

        // firstKey()
        System.out.println("\nFirst Roll Number:");
        System.out.println(students.firstKey());

        // lastKey()
        System.out.println("\nLast Roll Number:");
        System.out.println(students.lastKey());

        // higherKey()
        System.out.println("\nHigher key than 102:");
        System.out.println(students.higherKey(102));

        // lowerKey()
        System.out.println("\nLower key than 102:");
        System.out.println(students.lowerKey(102));

        // ceilingKey()
        System.out.println("\nCeiling key of 102:");
        System.out.println(students.ceilingKey(102));

        // floorKey()
        System.out.println("\nFloor key of 102:");
        System.out.println(students.floorKey(102));

        // subMap()
        System.out.println("\nStudents between 102 and 104:");
        System.out.println(students.subMap(102, true, 104, true));

        // descendingMap()
        System.out.println("\nDescending Order:");
        System.out.println(students.descendingMap());

        // remove()
        students.remove(105);

        System.out.println("\nAfter Removing Roll No 105:");
        System.out.println(students);

        // entrySet()
        System.out.println("\nUsing entrySet():");

        for(Map.Entry<Integer, String> entry : students.entrySet())
        {
            System.out.println(
                    entry.getKey() + " : " + entry.getValue()
            );
        }
    }
}