public class Exceptional_Handling_Eg31 {
    public static void main(String[] args) {
        Error obj = new Error();
      /*
        boolean flag1 = obj instanceof RuntimeException;   C.E
        boolean flag2 = obj instanceof Exception;     C.E

       */
        boolean flag3 = obj instanceof Error;
        boolean flag4 = obj instanceof Throwable;
        System.out.println(/* flag1 + " : " +flag2 +  */ " : "+flag3 + " : "+flag4);

        /*
        String s = "Hello";
         System.out.println( s  instanceof StringBuffer);
         when you use instanceof operator there should be some relationship between object and class
         here object s and class StrungBuffer has no parent-child (or) child-parent relation so it results in
         compile time error

         System.out.println ( s instanceof Runnable)
         whenever you are checking object with interface there is no rule that object and class should have relationship

         */


    }
}
