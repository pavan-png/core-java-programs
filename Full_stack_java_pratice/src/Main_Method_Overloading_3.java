/*  we can overload the main() method. But remember that the JVM always calls the main()
method with regular signature i.e is public static void main(String[] args) .
other main methods are ignored by jvm.

 */

public class Main_Method_Overloading_3 {
    public static void main(byte[] args) {
        System.out.println("this byte main method");
    }

    public static void main(short[] args) {
        System.out.println("this is short main method");
    }

    public static void main(int[] args) {
        System.out.println("this is int  main method");
    }

    public static void main(long[] args) {
        System.out.println("this is long main method");
        System.out.println("the number passed as long argument is " +args);
    }
    public static void main(float[] args) {
        System.out.println("this is float main method");
    }

    public static void main(double[] args) {
        System.out.println("this is double main method");
    }


    public static void main(char[] args) {
        System.out.println("this is char main method");
    }

    public static void main(boolean[] args) {
        System.out.println("this is boolean main method");
        System.out.println("boolean argument is " +args);
    }


    public static void main(String[] args) {
        // main method with regular signature is automatically called by the jvm. it does not need to be invoked manually.
        System.out.println("this is original main method");
    }
}