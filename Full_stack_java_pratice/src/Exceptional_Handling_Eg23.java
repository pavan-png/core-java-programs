public class Exceptional_Handling_Eg23 {

    public static void main(String[] args) {

        // Step 1:
        // Creating StringBuilder object.
        // Default capacity = 16 characters.
        StringBuilder sb = new StringBuilder();

        try {

            // Step 2:
            // Infinite loop (no termination condition).
            for (;;) {

                // Step 3:
                // Appending "hello" continuously.
                // StringBuilder keeps expanding internally.
                // Memory is allocated in heap.
                sb.append("hello");

                /*
                 As loop continues:
                 - StringBuilder grows
                 - Heap memory keeps increasing
                 - Eventually heap memory becomes full
                 - JVM throws OutOfMemoryError
                */
            }
        }

        catch (Exception e) {

            /*
             Step 5:
             This block will NOT execute.

             Why?

             Because OutOfMemoryError is NOT an Exception.
             It is a subclass of Error.

             Hierarchy:
                 Throwable
                    ├── Exception
                    └── Error
                          └── OutOfMemoryError

             catch(Exception e) cannot catch Error.
            */

            System.out.println("Exception");
        }

        // Step 6:
        // This line will NEVER execute
        // because program terminates abnormally
        // due to OutOfMemoryError.
        System.out.println("amundi ley inka paduko");
    }
}