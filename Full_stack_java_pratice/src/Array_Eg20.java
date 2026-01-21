public class Array_Eg20 {

    // Instance variable (reference type)
    // Default value is null (because it is an instance variable)
    String[] x;

    // 2D array declaration
    // int[] a[] means "array of int arrays"
    int[] a[] = { {1, 2}, {1} };

    /*
     * UPCASTING (Array → Object)
     * --------------------------------
     * long[] is a child class of Object
     * Storing child object reference (long[])
     * into parent reference (Object)
     *
     * This is UPCASTING
     * - Happens automatically
     * - No explicit cast required
     * - Compile-time safe
     *
     * Reference checking → Compile time
     * Object binding     → Runtime (JVM)
     */
    Object c = new long[4];

    /*
     * x is an instance variable, so default value (null) is assigned.
     * Using x here does NOT cause compile-time error.
     */

    /*
     * UPCASTING (String[] → Object)
     * --------------------------------
     * String[] is a child of Object
     * Assigning child reference to parent reference
     *
     * This is also UPCASTING
     */
    Object d = x;

    /*
     * UPCASTING (String[] → Object[])
     * --------------------------------
     * Arrays are covariant in Java
     * String[] IS-A Object[]
     *
     * Hence this is valid UPCASTING
     */
    // Object[] d = x;

    public static void main(String[] args) {

        Array_Eg20 obj = new Array_Eg20();

        /*
         * c holds reference to long[] object
         * Printing an array reference prints:
         *   class name + @ + hashcode
         * Example:
         *   [J@15db9742
         * [J → long array
         */
        System.out.println(obj.c);
    }
}
