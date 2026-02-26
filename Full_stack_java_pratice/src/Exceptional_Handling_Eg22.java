public class Exceptional_Handling_Eg22 {

    public static void main(String[] args) {

        try {

            // Step 1:
            // Calling main() method again with same arguments.
            // This creates recursive call to the same method.
            main(args);

            /*
             Step 2:
             There is NO stopping condition.
             So main() keeps calling itself infinitely.

             Each method call uses stack memory.
             This continues until stack memory becomes full.
            */

        }

        catch (Exception e) {

            /*
             Step 5:
             This catch block will NOT execute.

             Why?

             Because infinite recursion causes
             StackOverflowError.

             StackOverflowError is a subclass of Error,
             NOT a subclass of Exception.

             Hierarchy:
                 Throwable
                    ├── Exception
                    └── Error
                          └── StackOverflowError

             Since we are catching Exception,
             it cannot catch StackOverflowError.
            */

            System.out.println("catch - ");
        }

        // Step 6:
        // This line will NEVER execute
        // because program terminates abnormally.
        System.out.println("out");
    }
}