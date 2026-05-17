import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class LinkedHashMap_Eg1 {

    public static void main(String[] args) {

        /*
         * ============================================
         * 1. CREATE LINKEDHASHMAP
         * ============================================
         */

        LinkedHashMap<Integer, String> employees = new LinkedHashMap<>();


        /*
         * ============================================
         * 2. put()
         * Used to insert data
         * MOST COMMONLY USED
         * ============================================
         */

        employees.put(101, "Pavan");
        employees.put(102, "Rahul");
        employees.put(103, "Anjali");
        employees.put(104, "Kiran");

        System.out.println("After put():");
        System.out.println(employees);


        /*
         * ============================================
         * 3. get()
         * Used to retrieve value using key
         * MOST USED IN REALTIME
         * ============================================
         */

        String employee = employees.get(102);

        System.out.println("\nget(102):");
        System.out.println(employee);


        /*
         * ============================================
         * 4. containsKey()
         * Checks whether key exists
         * Used in validations
         * ============================================
         */

        System.out.println("\ncontainsKey(103):");
        System.out.println(employees.containsKey(103));


        /*
         * ============================================
         * 5. containsValue()
         * Checks whether value exists
         * ============================================
         */

        System.out.println("\ncontainsValue(\"Kiran\"):");
        System.out.println(employees.containsValue("Kiran"));


        /*
         * ============================================
         * 6. replace()
         * Updates existing value
         * Used heavily in realtime applications
         * ============================================
         */

        employees.replace(104, "Suresh");

        System.out.println("\nAfter replace():");
        System.out.println(employees);


        /*
         * ============================================
         * 7. remove()
         * Deletes entry
         * ============================================
         */

        employees.remove(101);

        System.out.println("\nAfter remove():");
        System.out.println(employees);


        /*
         * ============================================
         * 8. size()
         * Returns total entries
         * ============================================
         */

        System.out.println("\nsize():");
        System.out.println(employees.size());


        /*
         * ============================================
         * 9. isEmpty()
         * Checks whether map is empty
         * ============================================
         */

        System.out.println("\nisEmpty():");
        System.out.println(employees.isEmpty());


        /*
         * ============================================
         * 10. keySet()
         * Retrieves all keys
         * MOST USED
         * ============================================
         */

        Set<Integer> keys = employees.keySet();

        System.out.println("\nkeySet():");
        System.out.println(keys);


        /*
         * ============================================
         * 11. values()
         * Retrieves all values
         * ============================================
         */

        Collection<String> values = employees.values();

        System.out.println("\nvalues():");
        System.out.println(values);


        /*
         * ============================================
         * 12. entrySet()
         * MOST IMPORTANT METHOD
         * Used in almost every realtime project
         * ============================================
         */

        System.out.println("\nentrySet() Traversal:");

        for (Map.Entry<Integer, String> entry : employees.entrySet()) {

            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " --> " + value);
        }


        /*
         * ============================================
         * 13. putIfAbsent()
         * Inserts only if key not present
         * Used heavily in caching systems
         * ============================================
         */

        employees.putIfAbsent(102, "NewName");

        employees.putIfAbsent(105, "Teja");

        System.out.println("\nAfter putIfAbsent():");
        System.out.println(employees);


        /*
         * ============================================
         * 14. getOrDefault()
         * Used to avoid null checks
         * VERY COMMON IN INDUSTRY
         * ============================================
         */

        String result = employees.getOrDefault(999, "Employee Not Found");

        System.out.println("\ngetOrDefault():");
        System.out.println(result);


        /*
         * ============================================
         * 15. forEach()
         * Modern traversal approach
         * Java 8+
         * ============================================
         */

        System.out.println("\nforEach() Traversal:");

        employees.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });


        /*
         * ============================================
         * 16. clear()
         * Removes all entries
         * ============================================
         */

        employees.clear();

        System.out.println("\nAfter clear():");
        System.out.println(employees);
    }
}