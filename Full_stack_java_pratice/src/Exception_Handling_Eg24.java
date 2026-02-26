public class Exception_Handling_Eg24 {

    public static void main(String[] args) {

        try {

            // Step 1:
            // This statement simply prints 1.
            // It does NOT throw any checked exception.
            System.out.println(1);

        }

        catch (NullPointerException e) {

            /*
             Step 2:
             NullPointerException is an UNCHECKED exception
             (subclass of RuntimeException).

             Compiler does NOT check whether try block
             actually throws this exception.

             So this catch block is VALID.
            */

            System.out.println("One");
        }

        /*
        catch (FileNotFoundException e1) {

            Step 3:
            FileNotFoundException is a CHECKED exception
            (subclass of IOException).

            Compiler rule:
            If you write a catch block for a CHECKED exception,
            the compiler verifies whether the try block
            contains code that may throw that checked exception.

            In this try block:
                System.out.println(1);

            There is NO code that throws FileNotFoundException.

            So compiler gives error:

            "Unreachable catch block for FileNotFoundException.
             This exception is never thrown from the try statement body."

            Therefore this catch block causes COMPILATION ERROR.
        }
        */

        // Step 4:
        // This line executes normally.
        System.out.println("Three");
    }
}