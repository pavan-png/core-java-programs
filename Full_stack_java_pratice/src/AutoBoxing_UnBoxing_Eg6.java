public class AutoBoxing_UnBoxing_Eg6 {

    public static void main(String[] args) {

        // Using 'new' explicitly.
        // This ALWAYS creates a new Integer object in heap memory.
        // It does NOT use Integer cache.
        Integer i1 = new Integer(10);

        // Here we are using autoboxing.
        // Internally it becomes:
        // Integer i2 = Integer.valueOf(10);
        //
        // Since 10 is within cache range (-128 to 127),
        // Java will use Integer cache and reuse existing object
        // from cache pool.
        Integer i2 = 10;   // autoboxing (uses valueOf → cache)

        /*
         Important:
         - i1 → new object created by 'new'
         - i2 → object from Integer cache
         - They are two different objects in memory.
         - '==' compares references (memory addresses).
         - So result is FALSE.
        */

        System.out.println(i1 == i2);   // false
    }
}