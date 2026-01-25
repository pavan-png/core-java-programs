public class String_Eg71 {
    public static void main(String[] args) {

        // String used to collect the final result
        String res = "";

        // Array containing a normal String, null, and another String
        String[] arr = {"Dog", null, "Friendly"};

        // Enhanced for loop to traverse array elements
        for (String s : arr) {

            // IMPORTANT:
            // String.join("-", s) expects NON-NULL elements
            // If 's' is null, this line WILL throw NullPointerException
            //
            // So this line is actually UNSAFE when s == null
            res += String.join("-", s);
        }

        // This line will NOT be executed if NullPointerException occurs above
        System.out.println(res);

        // String.join(delimiter, elements...) works directly on VALUES
        // Here all elements are non-null, so it works perfectly
        System.out.println(String.join("-", "hello", "pavan", "kalyan"));

        // NOTE:
        // String.join() works with:
        // 1) Multiple direct elements (varargs)
        // 2) Iterable of elements
        // BUT all elements MUST be non-null
    }
}
