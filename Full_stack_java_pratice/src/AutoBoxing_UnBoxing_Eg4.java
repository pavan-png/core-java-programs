public class AutoBoxing_UnBoxing_Eg4 {

    public static void main(String[] args) {

        // 10 is primitive int
        // It is automatically converted (autoboxed) to Integer object.
        // Internally: Integer.valueOf(10)
        Integer i1 = 10;   // autoboxing

        // Here we are copying the reference of i1 into i2.
        // Both i1 and i2 now refer to the SAME Integer object (value 10).
        Integer i2 = i1;

        // i1++ looks simple, but internally it is:
        // 1) Unboxing: i1.intValue()
        // 2) Add 1
        // 3) Boxing again: Integer.valueOf(result)
        //
        // So internally:
        // i1 = Integer.valueOf(i1.intValue() + 1);
        //
        // VERY IMPORTANT:
        // A NEW Integer object (value 11) is created.
        // i1 now refers to new object.
        // i2 still refers to old object (value 10).
        i1++;   // autounboxing → increment → autoboxing

        // Prints 11
        System.out.println(i1);

        // Prints 10 (because i2 still points to old object)
        System.out.println(i2);

        // '==' compares object references (memory address).
        // Now i1 refers to Integer(11)
        // i2 refers to Integer(10)
        // They are different objects.
        System.out.println(i1 == i2);  // false
    }
}