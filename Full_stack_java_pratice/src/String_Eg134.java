public class String_Eg134 {
    public static void main(String[] args) {

        // StringBuilder constructor with int argument
        // When an int value is passed, it is treated as CAPACITY
        // It does NOT represent string content

        // Capacity represents the initial size of internal character array
        // Capacity must be ZERO or POSITIVE

        // Here -32 is passed as capacity
        // Negative capacity is NOT allowed
        // JVM throws NegativeArraySizeException at runtime
        StringBuilder sb = new StringBuilder(-32); // ❌ Runtime Exception

        // This line will NEVER execute because exception occurs above
        System.out.println(sb.append("AbC"));
    }
}
