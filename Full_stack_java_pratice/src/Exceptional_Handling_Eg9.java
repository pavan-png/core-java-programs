public class Exceptional_Handling_Eg9 {

    static int[] a;   // Step 1: Array reference declared.
    // IMPORTANT: It is NOT initialized. Default value of reference type = null

    static {
        // Step 2: Static block executes when class is loaded.
        // At this time, array 'a' is still null.

        try {
            a[0] = 2;     // Step 3: Trying to access index 0 of a null array.
            // This causes NullPointerException.
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // This method will NEVER execute.
        // Because exception occurs during class loading itself.

    }
}