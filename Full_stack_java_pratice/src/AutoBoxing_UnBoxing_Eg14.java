public class AutoBoxing_UnBoxing_Eg14 {

    public static void main(String[] args) {

        // new Integer(1) → creates Integer object containing 1
        // new Integer(2) → creates Integer object containing 2

        // "+" operator works only with primitive types
        // So both Integer objects are automatically UNBOXED to int

        // 1 + 2 = 3 (primitive int result)

        // Result 3 is then AUTOBOXED into Integer object
        Integer i = new Integer(1) + new Integer(2);

        // switch works only with primitive types (int, char, etc.)
        // Here 'i' is Integer object
        // So it is automatically UNBOXED to primitive int

        switch (i) {

            case 3:
                System.out.println("hello");
                break;

            default:
                System.out.println("hi");
                break;
        }
    }
}