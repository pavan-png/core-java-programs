public class String_Eg93 {
    public static void main(String[] args) {

        // Create a String variable with value "Hello"
        String text = "Hello";

        // Expression: text = text + (text = "pavan")
        // Evaluation of the right-hand side happens from LEFT to RIGHT

        // Step 1: First 'text' (on the left of +) is evaluated
        // Current value of text is "Hello"

        // Step 2: (text = "pavan") is evaluated
        // text is now reassigned to "pavan"
        // The value of this assignment expression is "pavan"

        // Step 3: String concatenation happens
        // "Hello" + "pavan" → "Hellopavan"

        // Step 4: The result "Hellopavan" is assigned back to text
        text = text + (text = "pavan");

        // Prints the final value of text
        System.out.println(text); // Hellopavan
    }
}
