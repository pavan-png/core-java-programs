public class AutoBoxing_Unboxing_Eg5 {

    public static void main(String[] args) {

        // Here we are explicitly using 'new'.
        // So a NEW Integer object is created in heap memory.
        // This does NOT use Integer cache.
        Integer x = new Integer(5);

        // Again 'new' creates another separate object.
        // Even though value is same (5),
        // memory location is different.
        Integer y = new Integer(5);

        // '==' compares object references (memory addresses),
        // NOT values.
        //
        // x and y point to two different objects.
        // So result is FALSE.
        System.out.println(x == y);  // false
    }
}