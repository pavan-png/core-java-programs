public class Exceptional_Handling_Eg15 {

    public static void main(String[] args) {

        try {
            // Step 1: Create object and call go()
            new Exceptional_Handling_Eg15().go();
        }
        catch (Exception e) {
            // Step 5: This block will NOT execute

            /*
             StackOverflowError is NOT an Exception.
             It is a subclass of Error.

             Hierarchy:
             Throwable
                ├── Exception
                └── Error
                      └── StackOverflowError

             Since we are catching Exception,
             it cannot catch StackOverflowError.
            */

            System.out.println("ouch");
        }
    }

    void go() {

        // Step 2: Method calls itself
        go();

        /*
         Step 3: This creates infinite recursion.
         Each method call occupies some memory in the stack.

         Since there is no stopping condition,
         stack memory keeps filling.

         Step 4: When stack memory becomes full,
         JVM throws StackOverflowError.
        */
    }
}