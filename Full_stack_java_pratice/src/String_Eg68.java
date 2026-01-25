public class String_Eg68 {
    public static void main(String[] args) {

        // This line is COMMENTED because it causes a COMPILATION ERROR
        // System.out.println("Output is : " + 10 != 5);

        // WHY is it an error?

        // Step 1: "Output is : " + 10
        // Result → "Output is : 10"   (String concatenation)

        // Step 2: Now Java tries to evaluate:
        // "Output is : 10" != 5

        // != is a comparison operator
        // It CANNOT compare a String with an int
        // So this causes a COMPILE-TIME ERROR

        // ERROR TYPE:
        // bad operand types for binary operator '!='
        // String != int  ❌
    }
}
