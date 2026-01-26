public class String_Eg130 {
    public static void main(String[] args) {

        // StringBuilder is MUTABLE
        // Initial content:
        // Index : 0 1 2 3 4 5 6 7 8 9
        // Value : 0 1 2 3 4 5 6 7 8 9
        StringBuilder sb = new StringBuilder("0123456789");

        // delete(3, 6)
        // Deletes characters from index 3 to (6 - 1) i.e. index 3,4,5
        // Characters removed → 3,4,5
        // Result → "0126789"
        sb.delete(3, 6);

        // deleteCharAt(4)
        // Current string → "0126789"
        // Index : 0 1 2 3 4 5 6
        // Value : 0 1 2 6 7 8 9
        // Character at index 4 → '7' is removed
        // Result → "012689"
        sb.deleteCharAt(4);

        // deleteCharAt(5)
        // Current string → "012689"
        // Index : 0 1 2 3 4 5
        // Value : 0 1 2 6 8 9
        // Character at index 5 → '9' is removed
        // Final result → "01268"
        sb.deleteCharAt(5);

        // StringBuilder methods return the SAME object reference
        // Hence method chaining works
        System.out.println(sb);   // prints 01268
    }
}
