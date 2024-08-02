public class Var_Args_With_Respect_To_Main_Method {
    public static void main(String...args) {
        System.out.println("hi");
    }
    /*
     public static void main(String...  args) {   // this main method signature is also allowed but above main
     is similar like this method.  Both cant we used at a time.
         System.out.println("hi");
    }
     */

    public static void main(String[]... args) {
        System.out.println("hello");
    }

}
