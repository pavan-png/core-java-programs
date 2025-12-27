public class Do_While_Eg5 {
    public static void main(String[] args) {

        // OUTER do-while loop starts here
        do

            // This 'while(true)' is NOT the condition of the do-while
            // It is the BODY of the do loop
            // This is an INFINITE while loop
            while (true)

                // This statement belongs to the INNER while loop
                // Since while(true) never ends,
                // "hello" is printed infinitely
                System.out.println("hello");

            // This 'while(true);' is the CONDITION of the OUTER do-while loop
            // But control NEVER reaches here
            // because the inner while(true) is infinite
        while (true);

        // Any code written here would be unreachable
    }
}
