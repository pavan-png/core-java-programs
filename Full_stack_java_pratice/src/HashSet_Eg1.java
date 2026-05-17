import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Eg1{
    public static void main(String[] args)
    {
        // =====================================================
        // 1. add()
        // =====================================================

        HashSet<String> employees = new HashSet<>();

        System.out.println("===== add() =====");

        System.out.println(
                employees.add("Rahul"));

        System.out.println(
                employees.add("Aman"));

        System.out.println(
                employees.add("Kiran"));

        // duplicate
        System.out.println(
                employees.add("Rahul"));

        System.out.println(employees);



        // =====================================================
        // 2. contains()
        // =====================================================

        System.out.println("\n===== contains() =====");

        System.out.println(
                employees.contains("Aman"));

        System.out.println(
                employees.contains("Vikas"));



        // =====================================================
        // 3. remove()
        // =====================================================

        System.out.println("\n===== remove() =====");

        System.out.println(
                employees.remove("Kiran"));

        System.out.println(employees);



        // =====================================================
        // 4. iterator()
        // =====================================================

        System.out.println("\n===== iterator() =====");

        Iterator<String> itr =
                employees.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }



        // =====================================================
        // 5. size()
        // =====================================================

        System.out.println("\n===== size() =====");

        System.out.println(
                employees.size());



        // =====================================================
        // 6. isEmpty()
        // =====================================================

        System.out.println("\n===== isEmpty() =====");

        System.out.println(
                employees.isEmpty());



        // =====================================================
        // 7. addAll()
        // =====================================================

        System.out.println("\n===== addAll() =====");

        HashSet<String> developers =
                new HashSet<>();

        developers.add("Java");
        developers.add("Spring");
        developers.add("React");

        employees.addAll(developers);

        System.out.println(employees);



        // =====================================================
        // 8. retainAll()
        // =====================================================

        System.out.println("\n===== retainAll() =====");

        HashSet<String> commonSkills =
                new HashSet<>();

        commonSkills.add("Java");
        commonSkills.add("Rahul");

        employees.retainAll(commonSkills);

        System.out.println(employees);



        // =====================================================
        // 9. removeAll()
        // =====================================================

        System.out.println("\n===== removeAll() =====");

        HashSet<String> removeSet =
                new HashSet<>();

        removeSet.add("Rahul");

        employees.removeAll(removeSet);

        System.out.println(employees);



        // =====================================================
        // 10. forEach()
        // =====================================================

        System.out.println("\n===== forEach() =====");

        employees.forEach(System.out::println);



        // =====================================================
        // 11. clone()
        // =====================================================

        System.out.println("\n===== clone() =====");

        HashSet<String> clonedSet =
                (HashSet<String>) employees.clone();

        System.out.println(clonedSet);



        // =====================================================
        // 12. equals()
        // =====================================================

        System.out.println("\n===== equals() =====");

        HashSet<String> testSet =
                new HashSet<>();

        testSet.addAll(clonedSet);

        System.out.println(
                clonedSet.equals(testSet));



        // =====================================================
        // 13. hashCode()
        // =====================================================

        System.out.println("\n===== hashCode() =====");

        System.out.println(
                employees.hashCode());



        // =====================================================
        // 14. toArray()
        // =====================================================

        System.out.println("\n===== toArray() =====");

        Object[] arr = employees.toArray();

        for(Object x : arr)
        {
            System.out.println(x);
        }



        // =====================================================
        // 15. stream()
        // =====================================================

        System.out.println("\n===== stream() =====");

        employees.stream()
                .forEach(System.out::println);



        // =====================================================
        // 16. spliterator()
        // =====================================================

        System.out.println("\n===== spliterator() =====");

        employees.spliterator()
                .forEachRemaining(
                        System.out::println);



        // =====================================================
        // 17. clear()
        // =====================================================

        System.out.println("\n===== clear() =====");

        employees.clear();

        System.out.println(employees);



        // =====================================================
        // 18. isEmpty() after clear
        // =====================================================

        System.out.println("\n===== isEmpty() After clear =====");

        System.out.println(
                employees.isEmpty());
    }
}