class AA {
    public String toString() {
        return null;   // toString() returns null intentionally
    }
}

public class String_Eg76 {
    public static void main(String[] args) {

        // text reference is null (no String object yet)
        String text = null;

        // IMPORTANT RULE:
        // Whenever the '+' operator is used and AT LEAST ONE operand is a String,
        // Java performs STRING CONCATENATION.
        //
        // During string concatenation, Java does NOT operate directly on references.
        // Instead, it internally calls String.valueOf() on BOTH operands.
        //
        // String.valueOf(null) safely converts null into the String "null",
        // so NO NullPointerException is thrown.
        //
        // Internally, this line behaves like:
        // text = String.valueOf(text) + String.valueOf(new AA());
        //
        // String.valueOf(text)      → "null"
        // String.valueOf(new AA())  → calls toString(), which returns null,
        //                              then converts it to "null"
        //
        // Final result: "null" + "null" = "nullnull"
        text = text + new AA();

        // text now refers to the String "nullnull"
        // So length() works normally
        System.out.println(text.length()); // Output: 8
    }
}
