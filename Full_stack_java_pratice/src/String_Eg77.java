public class String_Eg77 {
    public static void main(String[] args) {

        // Normal String object
        String s1 = "Hello";

        // Calling toString() on a valid String object
        // String overrides toString(), so it returns the same content
        System.out.println(s1.toString()); // Hello

        // String reference pointing to null
        String s = null;

        // Calling any method on a null reference causes NullPointerException
        // System.out.println(s.toString()); // ❌ NullPointerException

        // Printing a null reference using println
        // println internally uses String.valueOf(Object)
        // String.valueOf(null) returns the String "null"
        System.out.println(s); // prints: null

        // This is INVALID:
        // String s2 = null + null; // ❌ Compile-time error
        //
        // Reason:
        // '+' requires at least one operand to be a String
        // Here, both operands are null literals → no String involved
        // So compiler cannot decide how to apply '+'

        // This IS VALID:
        // At least one operand (s) is of type String
        // So '+' is treated as STRING CONCATENATION
        //
        // Internally this becomes:
        // s = String.valueOf(null) + String.valueOf(s);
        //
        // String.valueOf(null) → "null"
        // String.valueOf(s)    → "null"
        //
        // Result: "nullnull"
        s = null + s;

        // s now refers to a real String object: "nullnull"
        System.out.println(s); // nullnull

        // Since s is now a valid String object,
        // all String methods can be safely called
        System.out.println(s.length());   // 8
        System.out.println(s.charAt(2));  // 'l'
    }
}
