public class Switch_Eg20 {
    public static void main(String[] args) {

        String opt = "True";

        /*
         The switch expression is of type String.
         String is supported in switch statements (Java 7+).

         IMPORTANT:
         ----------
         String comparison in switch is CASE-SENSITIVE
         and is done using String.equals().
        */
        switch (opt) {

            /*
             This case MATCHES because:
             opt = "True" and case label is also "True".

             "True" is printed.
             `break` stops further switch execution.
            */
            case "True":
                System.out.println("True");
                break;

            /*
             default executes ONLY if no case matches.
             Since a matching case is found above,
             default is SKIPPED.
            */
            default:
                System.out.println("*****");
        }

        /*
         This statement executes after the switch block
         regardless of which case is matched.
        */
        System.out.println("Done");
    }
}
