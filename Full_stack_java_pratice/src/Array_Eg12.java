public class Array_Eg13 {
    public static void main(String[] args) {

        // ❌ INVALID array creation
        // Size is NOT given, so compiler error occurs
        // int[] a = new int[];

        // ✅ VALID array creation
        // Size is given as 0
        // Compiler allows this
        // Array is created with length = 0
        // No compile-time error
        // No runtime exception
        int[] b = new int[0];

        // ❌ RUNTIME ERROR case
        // Size is given as -4 (negative size)
        // Compiler does NOT check whether size is positive or negative
        // Code compiles successfully
        // At runtime, JVM throws:
        // NegativeArraySizeException
        int[] c = new int[-4];
    }
}
