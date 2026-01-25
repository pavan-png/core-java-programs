public class String_Eg69 {
    public static void main(String[] args) {

        // Parentheses () have higher precedence
        // So the expression inside () is evaluated FIRST

        // Step 1: (10 != 5)
        // 10 is not equal to 5 → result is boolean true

        // Step 2: "Output is : " + true
        // String + boolean → String concatenation

        // Since types are compatible after evaluation,
        // there is NO compile-time error
        System.out.println("Output is : " + (10 != 5));
    }
}
