public class AutoBoxing_UnBoxing_Eg8 {

    public static void main(String[] args) {

        // Using 'new' explicitly.
        // Each 'new' creates a separate object in heap.
        // Cache is NOT used.
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        // '==' compares references.
        // Two different heap objects → false.
        System.out.println(i1 == i2);   // false



        // valueOf(11) is used directly.
        // 11 is within cache range (-128 to 127).
        // So cached object is reused.
        Integer i3 = Integer.valueOf(11);
        Integer i4 = Integer.valueOf(11);

        // Both refer to same cached object → true.
        System.out.println(i3 == i4);   // true



        // Autoboxing.
        // Compiler converts:
        // Integer i5 = Integer.valueOf(12);
        Integer i5 = 12;
        Integer i6 = 12;

        // 12 is inside cache range.
        // Same cached object reused.
        System.out.println(i5 == i6);   // true



        // i7 uses autoboxing → valueOf(13)
        Integer i7 = 13;

        // i8 explicitly calls valueOf(13)
        Integer i8 = Integer.valueOf(13);

        // Both use same cached object (since 13 in range)
        System.out.println(i7 == i8);   // true
    }
}