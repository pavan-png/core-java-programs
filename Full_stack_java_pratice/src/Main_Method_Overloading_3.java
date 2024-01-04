//  we can overload the main() method. But remember that the JVM always calls the original main() method.
//  It does not call the overloaded main() method.
public class Main_Method_Overloading_3 {

    public static void main(int[] args) {
        System.out.println("this is int  main method");
    }

    public static void main(short[] args) {
        System.out.println("this is short main method");
    }

    public static void main(byte[] args) {
        System.out.println("this byte main method");
    }

    public static void main(float[] args) {
        System.out.println("this is float main method");
    }

    public static void main(long args) {
        System.out.println("this is long main method");
        System.out.println("the number passed as long argument is " +args);
    }

    public static void main(char args) {
        System.out.println("this is char main method");
    }

    public static void main(boolean args) {
        System.out.println("this is boolean main method");
        System.out.println("boolean argument is " +args);
    }

    // we can invoke the overloaded main() method by calling it from main method
    public static void main(String[] args) {
        System.out.println("this is original main method");

        /*  overloaded method calling
        *   you can call overloaded main methods only if array o=of datatype is not declared
        * check below example */

        Main_Method_Overloading_3.main(23l);

        // you can also call static method by creating object
        Main_Method_Overloading_3 obj = new Main_Method_Overloading_3();
        obj.main(true);


    }
}