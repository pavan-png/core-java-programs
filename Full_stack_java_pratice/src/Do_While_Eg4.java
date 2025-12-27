public class Do_While_Eg4 {
    public static void main(String[] args) {

        // do-while loop with an EMPTY BODY
        // The semicolon (;) is an EMPTY STATEMENT
        // Empty statement is a valid statement in Java

        do
            ;   // This is the body of the do-while loop (does nothing)

            // The condition is checked AFTER executing the body
            // 'true' is a boolean literal known at compile time
            // Since the condition is always true, the loop becomes INFINITE
        while (true);

        // Any statement written after this loop would be unreachable
        // because this loop never terminates
    }
}
