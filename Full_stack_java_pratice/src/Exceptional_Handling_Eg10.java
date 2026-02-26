// Step 1: Creating a user-defined (custom) exception
class TestException extends Exception {

    /*
     TestException is a custom exception.
     Since it extends Exception (not RuntimeException),
     it becomes a CHECKED exception.

     Checked exceptions must be either:
     - Handled using try-catch
     OR
     - Declared using throws keyword.
    */

    // Default constructor
    public TestException() {
        super();   // Calls parent (Exception) default constructor
    }

    // Constructor with message
    public TestException(String s) {
        super(s);  // Passes message to parent Exception class
    }
}


public class Exceptional_Handling_Eg10 {

    /*
     m1() is declaring: throws Exception

     This is called "ducking the exception".

     Ducking means:
     → Instead of handling the exception here,
       we pass responsibility to the caller.

     Important rule:
     In throws clause, we can declare:
     - Same exception type (TestException)
     OR
     - Its parent type (Exception)
    */

    public void m1() throws Exception {

        /*
         Here we are explicitly throwing an exception
         using the throw keyword.

         This is called rethrowing or manually throwing.

         Even though method declares: throws Exception,
         we are throwing TestException.

         This is valid because:
         TestException IS-A Exception.
        */

        throw new TestException("Custom exception occurred");
    }

    public static void main(String[] args) {

        /*
         main() is calling nothing here.

         If we call m1(), we must:
         - Either handle using try-catch
         OR
         - Declare throws Exception in main()
        */

    }
}