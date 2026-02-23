public class ToString_For_Binary_Octal_Hex {

    public static void main(String[] args) {

        // 🔷 These methods convert decimal primitive
        // into String representation of specific number system.

        // 22 (decimal) → binary
        String s1 = Integer.toBinaryString(22);
        System.out.println("Binary of 22: " + s1);
        // 22 = 10110

        // 74 (decimal) → octal
        String s2 = Integer.toOctalString(74);
        System.out.println("Octal of 74: " + s2);
        // 74 = 112

        // 45 (decimal) → hexadecimal
        String s3 = Integer.toHexString(45);
        System.out.println("Hexadecimal of 45: " + s3);
        // 45 = 2d


        System.out.println();
        System.out.println("Alternative way using toString(number, radix)");

        // 🔷 Alternative method (Form-3)
        // Using toString(value, radix)

        String s4 = Integer.toString(22, 2);   // base 2
        String s5 = Integer.toString(74, 8);   // base 8
        String s6 = Integer.toString(45, 16);  // base 16

        System.out.println("Binary (alternative): " + s4);
        System.out.println("Octal (alternative): " + s5);
        System.out.println("Hex (alternative): " + s6);

        /*
         Important Concepts:

         1. toBinaryString(), toOctalString(), toHexString()
            are shortcut methods.

         2. They internally work similar to:
            toString(value, 2)
            toString(value, 8)
            toString(value, 16)

         3. Output is always String type.

         4. Letters in hexadecimal are printed in lowercase (a-f).
        */
    }
}