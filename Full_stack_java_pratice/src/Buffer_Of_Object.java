public class Buffer_Of_Object {

    public static void main(String[] args) {

        // Autoboxing
        // Internally: Integer x = Integer.valueOf(10);
        // 10 is within cache range (-128 to 127)
        // So cached object is reused.
        Integer x = 10;

        // Again valueOf(10) is called.
        // JVM finds 10 already present in cache.
        // Same object reference is reused.
        Integer y = 10;

        // '==' compares references.
        // Both x and y point to SAME cached object.
        System.out.println(x == y);   // true



        // Autoboxing for Long
        // Internally: Long z = Long.valueOf(10L);
        // Long also has cache range (-128 to 127)
        // 10L is inside range → reused.
        Long z = 10l;

        // Same cached object reused.
        Long f = 10l;

        // Both references point to same cached Long object.
        System.out.println(z == f);   // true



        // 100 is within Integer cache range (-128 to 127)
        // So cached object reused.
        Integer a = 100;
        Integer b = 100;

        // Same object → true
        System.out.println(a == b);   // true



        // 1000 is OUTSIDE cache range
        // So valueOf(1000) creates NEW object in heap.
        Integer i = 1000;
        Integer j = 1000;

        // Two different objects created.
        // References are different.
        System.out.println(i == j);   // false
    }
}