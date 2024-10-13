public class Exceptional_Handling_Eg32 {
    public static void main(String[] args) {
        System.out.println(new RuntimeException());  // public java.lang.Throwable();

        System.out.println(new RuntimeException("hello"));   // public java.lang.Throwable(java.lang.String);

        System.out.println(new RuntimeException(new RuntimeException("Hello")));
        //                                               |
        //                                            this is of Throwable type
           // public java.lang.Throwable(java.lang.Throwable);

        /*
        parent of RuntimeException is Exception
        and parent of Exception is Throwable
        means the below constructors are available for RuntimeException class also due to parent-child relation
        so the above code compiles and executes without error.

         public java.lang.Throwable();
         public java.lang.Throwable(java.lang.String);
         public java.lang.Throwable(java.lang.Throwable);
         */

    }

}
