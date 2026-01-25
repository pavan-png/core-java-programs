public class String_Eg56 {
    public static void main(String[] args) {

        // Both "" are EMPTY STRING LITERALS
        // String literals are stored in String Constant Pool (SCP)
        // Same literal → same memory reference
        // == compares references
        System.out.print("" == "");   // true

        // Just printing a space for separation in output
        System.out.print(" ");

        // "A" and "A" are SAME string literals
        // Only one "A" object exists in SCP
        // Both references point to the SAME object
        System.out.print("A" == "A"); // true

        // This is just a STRING being printed, not a comparison
        System.out.print(" a==A");
    }
}
