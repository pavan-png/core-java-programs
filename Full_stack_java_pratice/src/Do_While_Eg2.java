public class Do_While_Eg2 {
    public static void main(String[] args) {

        // do-while loop WITHOUT braces
        // When only ONE statement is present,
        // braces { } are OPTIONAL

        do
            // This single statement is the BODY of the do-while loop
            // It executes FIRST, before checking the condition
            System.out.println("hello");

            // Condition is checked AFTER executing the body
            // 'true' is a boolean literal known at compile time
            // This condition NEVER becomes false
        while (true);

        // Any statement written here would be unreachable
        // because the loop is infinite
    }
}
