public class Byte_To_Int_Typecasting_Expression {
    public static void main(final String[] args) {

        /*
         * byte to int implicit widening is allowed, but int to byte requires explicit type casting.
         *
         * In the expression (b1 + i + b2):
         * - b1 is byte
         * - i is int
         * - b2 is byte
         *
         * During arithmetic, byte values are promoted to int.
         * So the expression becomes: int + int + int → int
         *
         * Since the result is not stored in any variable and is directly printed,
         * println(int) is valid, and no further type casting is needed.
         */

        byte b1 = 10;
        int i = b1;       // implicit widening (byte → int)
        byte b2 = (byte) i; // explicit narrowing (int → byte)

        System.out.println(b1 + i + b2); // final result is int
    }
}
