public class String_Eg67 {
    public static void main(String[] args) {

        // RULE:
        // '+' performs arithmetic addition UNTIL a String is encountered.
        // Once a String is encountered, '+' performs string concatenation.

        // Evaluation happens from LEFT to RIGHT

        // Step 1: 1 + 2 = 3        (addition)
        // Step 2: 3 + 3 = 6        (addition)
        // Step 3: 6 + 4 = 10       (addition)
        // Step 4: 10 + "Hello" = "10Hello" (concatenation)

        System.out.println(1 + 2 + 3 + 4 + "Hello");
    }
}
