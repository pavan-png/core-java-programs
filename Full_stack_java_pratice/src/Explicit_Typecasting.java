public class Explicit_Typecasting {
    public static void main(String[] args) {

        byte a = 10;       // byte
        double b = 5;      // double

        /*
         * a * b → byte * double
         * byte promotes to double
         * result type = double
         * double cannot fit into byte → explicit cast needed
         */
        byte c = (byte) (a * b);
        System.out.println(c);  // prints truncated double value

        /*
         * a / b → byte / double
         * result is double
         * double to byte requires explicit cast
         */
        c = (byte) (a / b);
        System.out.println(c);
    }
}
