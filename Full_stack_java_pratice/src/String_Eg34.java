public class String_Eg34 {
    public static void main(String[] args) {

        // Declaring two long variables
        long x = 42L;
        long y = 44L;

        // If the FIRST operand is a String,
        // all remaining operands are treated as Strings
        // and concatenation happens from LEFT to RIGHT
        // " " + 7 → " 7"
        // " 7" + 2 → " 72"
        // " 72" + " " → " 72 "
        System.out.println(" " + 7 + 2 + " ");

        // foo() returns a String ("foo")
        // Since the FIRST operation is String,
        // all remaining values are concatenated as Strings
        // "foo" + 42 → "foo42"
        // "foo42" + 5 → "foo425"
        // "foo425" + " " → "foo425 "
        System.out.println(foo() + x + 5 + " ");

        // Here the FIRST operation is NOT String
        // x + y → 42 + 44 = 86 (normal numeric addition)
        // Then 86 + "foo" → "86foo" (String concatenation)
        System.out.println(x + y + foo());
    }

    // This method returns a String
    static String foo() {
        return "foo";
    }
}
