public class Exceptional_Handling_Eg30 {

    public static void main(String[] args) {

        /*
         Step 1:
         Creating RuntimeException object using
         no-argument constructor.

         RuntimeException inherits constructors
         from its parent classes.

         Hierarchy:
             Throwable
                ↑
             Exception
                ↑
             RuntimeException
        */
        System.out.println(new RuntimeException());

        /*
         Step 2:
         Creating RuntimeException object
         with a message.

         This internally uses constructor
         that accepts a String message.

         The message becomes the "detail message"
         stored inside Throwable.
        */
        System.out.println(new RuntimeException("hello"));

        /*
         Step 3:
         Creating RuntimeException object
         with another RuntimeException as cause.

         Constructor used:
             Throwable(Throwable cause)

         Here:
             new RuntimeException("Hello")
             becomes the cause.

         So this is called "Exception Chaining".
        */
        System.out.println(
                new RuntimeException(
                        new RuntimeException("Hello")
                )
        );

        /*
         Important Concept:

         RuntimeException extends Exception,
         and Exception extends Throwable.

         Constructors available in Throwable:

             public Throwable()
             public Throwable(String message)
             public Throwable(Throwable cause)
             public Throwable(String message, Throwable cause)

         Because of inheritance,
         these constructors are available
         in RuntimeException class also.
        */
    }
}