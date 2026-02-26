public class Exceptional_Handling_Eg14 {

    static String s = "";
    // Step 1: Static variable initialized → s = ""

    public static void main(String[] args) {

        try {
            // Step 2: Enter try block
            s += "1";          // s = "1"

            // Step 3: Explicitly throwing checked exception
            throw new Exception();

            // After this line, remaining try block would not execute
        }

        catch(Exception e) {
            // Step 4: Exception from try is caught here
            s += "2";          // s = "12"
        }

        finally {
            // Step 5: finally block ALWAYS executes
            s += "3";          // s = "123"

            // Step 6: Calling doStuff()
            // This method causes ArithmeticException (unchecked)
            doStuff();         // Runtime exception occurs here

            // Step 8: This line NEVER executes
            // because exception already occurred above
            s += "4";          // ❌ skipped
        }

        // Step 9: This line NEVER executes
        // because program terminates abnormally
        System.out.println(s);
    }

    static void doStuff() {

        // Step 7: Division by zero
        int x = 0;
        int y = 7 / x;   // ❌ ArithmeticException occurs here
    }
}